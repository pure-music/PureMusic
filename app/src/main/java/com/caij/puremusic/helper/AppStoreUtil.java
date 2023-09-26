package com.caij.puremusic.helper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/**
 * Created by Ca1j on 2017/2/28.
 */

public class AppStoreUtil {

    /**
     * 根据应用包名，跳转到应用市场
     *
     * @param activity    承载跳转的Activity
     * @param packageName 所需下载（评论）的应用包名
     */
    public static void toAppStore(Activity activity, String packageName) throws Exception {
        toAppStore(activity, packageName, null);
    }

    /**
     * 根据应用包名，跳转到应用市场
     *
     * @param activity    承载跳转的Activity
     * @param packageName 所需下载（评论）的应用包名
     */
    public static void toAppStore(Activity activity, String packageName, String storePackageName) throws Exception {
        try {
            Uri uri = Uri.parse("market://details?id=" + packageName);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            if (!TextUtils.isEmpty(storePackageName)) {
                intent.setPackage(storePackageName);
            }
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            activity.startActivity(intent);
        } catch (Exception e) {
            throw new Exception("not found app store");
        }
    }
}

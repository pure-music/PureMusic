package com.caij.puremusic.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.caij.sharedpreferences.mmkv.MMKVSharedPreferencesFactory;

import java.io.File;

public class SPs {

    public static String PUBLIC_SP_FILE_NAME = "public_sp_file_name";

    private static MMKVSharedPreferencesFactory mDefaultSharedPreferencesFactory;

    private static synchronized void initSharedPreferencesFactory() {
        if (mDefaultSharedPreferencesFactory == null) {
            mDefaultSharedPreferencesFactory = new MMKVSharedPreferencesFactory();
        }
    }

    public static SharedPreferences getGlobalSharedPreferences(Context context) {
        return getSharedPreferences(context, PUBLIC_SP_FILE_NAME, Context.MODE_MULTI_PROCESS);
    }

    //非重要的  不要影响启动的数据读取
    public static SharedPreferences getGlobalSharedPreferences2(Context context) {
        return getSharedPreferences(context, PUBLIC_SP_FILE_NAME, Context.MODE_PRIVATE);
    }

    public static SharedPreferences getSharedPreferences(Context context, String name, int mode) {
        initSharedPreferencesFactory();
        return mDefaultSharedPreferencesFactory.getSharedPreferences(context, name, mode);
    }

}

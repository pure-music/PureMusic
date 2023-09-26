package com.caij.puremusic.util;

import android.app.Dialog;
import android.content.DialogInterface;

import java.lang.reflect.Field;

public class DialogCancelDissmissOnClickListener implements DialogInterface.OnClickListener {

    @Override
    public void onClick(DialogInterface dialog, int which) {
        try { //下面三句控制弹框的关闭
            Field field = Dialog.class.getDeclaredField("mShowing");
            field.setAccessible(true);
            field.set(dialog, false);//true表示要关闭
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dissmissDialog(Dialog dialog) {
        try { //下面三句控制弹框的关闭
            Field field = Dialog.class.getDeclaredField("mShowing");
            field.setAccessible(true);
            field.set(dialog, true);//true表示要关闭
        } catch (Exception e) {
            e.printStackTrace();
        }
        dialog.dismiss();
    }
}

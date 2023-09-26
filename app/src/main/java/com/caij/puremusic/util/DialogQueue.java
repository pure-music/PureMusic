package com.caij.puremusic.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.caij.lib.lifemanager.ActivityStackManager;
import com.caij.lib.lifemanager.AppLifecycle;
import com.caij.lib.lifemanager.BaseAppLifecycle;
import com.caij.vip.LogUtil;

import java.util.ArrayList;
import java.util.List;

public class DialogQueue {

    private static final int WHAT_SHOW = 1;
    private List<DialogInfo> dialogInfos;
    private final Handler mainHandler;
    private boolean isShowing;

    private static DialogQueue dialogQueue = new DialogQueue();

    public static DialogQueue getInstance() {
        return dialogQueue;
    }

    private DialogQueue() {
        mainHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == WHAT_SHOW) {
                    checkShow();
                }
            }
        };

        AppLifecycle.getInstance().registerAppLifecycleListener(new BaseAppLifecycle.AppLifecycleCallback() {
            @Override
            public void onAppLifeChange(String activity, boolean isForeground) {
                if (isForeground) {
                    postShowMessage();
                }
            }
        });
    }

    public void add(CharSequence title, CharSequence message, String ok,
                    DialogInterface.OnClickListener okOnClickListener) {
        add(title, message, ok, null, null, okOnClickListener, null, null);
    }

    public void add(CharSequence title, CharSequence message, String ok, String cancel,
                    DialogInterface.OnClickListener okOnClickListener, DialogInterface.OnClickListener cancelOnClickListener) {
        add(title, message, ok, cancel, null, okOnClickListener, cancelOnClickListener, null);
    }

    public void add(CharSequence title, CharSequence message, String ok, String cancel,
                    DialogInterface.OnClickListener okOnClickListener, DialogInterface.OnClickListener cancelOnClickListener, DialogInterface.OnShowListener onShowListener) {
        add(title, message, ok, cancel, null, okOnClickListener, cancelOnClickListener, null, onShowListener);
    }

    public void add(CharSequence title, CharSequence message, String ok, String cancel, String neutralText,
                    DialogInterface.OnClickListener okOnClickListener,
                    DialogInterface.OnClickListener cancelOnClickListener,
                    DialogInterface.OnClickListener neutralOnClickListener) {
        add(title, message, ok, cancel, neutralText, okOnClickListener, cancelOnClickListener, neutralOnClickListener, null);
    }

    public void add(CharSequence title, CharSequence message, String ok, String cancel, String neutralText,
                    DialogInterface.OnClickListener okOnClickListener,
                    DialogInterface.OnClickListener cancelOnClickListener,
                    DialogInterface.OnClickListener neutralOnClickListener, DialogInterface.OnShowListener onShowListener) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("必须主线程");
        }
        if (dialogInfos == null) {
            dialogInfos = new ArrayList<>();
        }
        dialogInfos.add(new DialogInfo(title, message, ok, cancel, neutralText, okOnClickListener, cancelOnClickListener, neutralOnClickListener, onShowListener));
        postShowMessage();
    }

    private void postShowMessage() {
        if (!mainHandler.hasMessages(WHAT_SHOW)) {
            checkShow();
        }
    }

    private void checkShow() {
        Activity activity = getTopActivity();
        if (!isShowing && !dialogInfos.isEmpty()
                && activity != null && !activity.isDestroyed()) {
            DialogInfo dialogInfo = dialogInfos.remove(0);
            show(activity, dialogInfo);
            isShowing = true;
        }
    }

    private void show(Activity activity, DialogInfo dialogInfo) {
        Dialog dialog = DialogUtil.createHintDialog(activity, dialogInfo.title, dialogInfo.message,
                dialogInfo.ok, dialogInfo.okOnClickListener,
                dialogInfo.cancel, dialogInfo.cancelOnClickListener,
                dialogInfo.neutralText, dialogInfo.neutralOnClickListener);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                isShowing = false;
                postShowMessage();
            }
        });
        dialog.setOnShowListener(dialogInfo.onShowListener);
        dialog.show();

        TextView textView = dialog.getWindow().findViewById(android.R.id.message);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private Activity getTopActivity() {
        Activity activity = ActivityStackManager.getInstance().getTopActivity();
        if (activity != null) {
            LogUtil.d("getTopActivity", "TOP ACTIVITY " + activity.getClass().getName());
            return activity;
        }
        return null;
    }

    private static class DialogInfo {
        CharSequence title;
        CharSequence message;
        String ok;
        String cancel;
        String neutralText;
        DialogInterface.OnClickListener okOnClickListener;
        DialogInterface.OnClickListener cancelOnClickListener;
        DialogInterface.OnClickListener neutralOnClickListener;
        DialogInterface.OnShowListener onShowListener;

        public DialogInfo(CharSequence title, CharSequence message, String ok, String cancel, String neutralText,
                          DialogInterface.OnClickListener okOnClickListener, DialogInterface.OnClickListener cancelOnClickListener,
                          DialogInterface.OnClickListener neutralOnClickListener, DialogInterface.OnShowListener onShowListener) {
            this.title = title;
            this.message = message;
            this.ok = ok;
            this.cancel = cancel;
            this.neutralText = neutralText;
            this.okOnClickListener = okOnClickListener;
            this.cancelOnClickListener = cancelOnClickListener;
            this.neutralOnClickListener = neutralOnClickListener;
            this.onShowListener = onShowListener;
        }
    }
}

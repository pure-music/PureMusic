package com.caij.puremusic.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.caij.lib.lifemanager.ActivityStackManager;


/**
 * Created by Caij on 2016/6/25.
 */
public class DialogUtil {

    public static Dialog showHintDialog(Context context, CharSequence title,
                                        CharSequence message,
                                 String pbText,
                                 DialogInterface.OnClickListener pbOnClickListener) {
        AlertDialog.Builder builder = new AB(context);
        Dialog dialog = builder.setMessage(message).setTitle(title)
                .setPositiveButton(pbText, pbOnClickListener)
                .create();
        dialog.show();
        return dialog;
    }

    public static Dialog showHintDialog(Context context, CharSequence title,
                                        CharSequence message,
                                        String pbText,
                                        DialogInterface.OnClickListener okOnClickListener,
                                        String cancelText,
                                        DialogInterface.OnClickListener cancelOnClickListener) {
        AlertDialog.Builder builder = new AB(context);
        Dialog dialog = builder.setMessage(message).setTitle(title)
                .setPositiveButton(pbText, okOnClickListener)
                .setNegativeButton(cancelText, cancelOnClickListener)
                .setCancelable(false)
                .create();
        dialog.show();
        return dialog;
    }

    public static Dialog createHintDialog(Context context, CharSequence title, CharSequence message,
                                        String pbText, DialogInterface.OnClickListener okOnClickListener,
                                        String cancelText, DialogInterface.OnClickListener cancelOnClickListener,
                                        String neutralText, DialogInterface.OnClickListener neutralOnClickListener) {
        AlertDialog.Builder builder = new AB(context);
        Dialog dialog = builder.setMessage(message).setTitle(title)
                .setPositiveButton(pbText, okOnClickListener)
                .setNegativeButton(cancelText, cancelOnClickListener)
                .setNeutralButton(neutralText, neutralOnClickListener)
                .setCancelable(false)
                .create();
        return dialog;
    }

    public static Dialog showHintDialog(Context context, CharSequence title, CharSequence message,
                                        String pbText, DialogInterface.OnClickListener okOnClickListener,
                                        String cancelText, DialogInterface.OnClickListener cancelOnClickListener,
                                        String neutralText, DialogInterface.OnClickListener neutralOnClickListener) {
        AlertDialog.Builder builder = new AB(context);
        Dialog dialog = builder.setMessage(message).setTitle(title)
                .setPositiveButton(pbText, okOnClickListener)
                .setNegativeButton(cancelText, cancelOnClickListener)
                .setNeutralButton(neutralText, neutralOnClickListener)
                .setCancelable(false)
                .create();
        dialog.show();
        return dialog;
    }

    public static Dialog showSingleSelectDialog(Context context, String title, String[] items,
                                                String cancel, DialogInterface.OnClickListener onClickListener,
                                                String ok, DialogInterface.OnClickListener okClickListener,
                                                int selectIndex, final DialogInterface.OnClickListener singleSelectListener) {
        AlertDialog.Builder builder = new AB(context);
        Dialog dialog = builder.setTitle(title)
                .setNegativeButton(cancel, onClickListener)
                .setPositiveButton(ok, okClickListener)
                .setSingleChoiceItems(items, selectIndex, singleSelectListener)
                .create();
        dialog.show();
        return dialog;
    }

    public static Dialog showMultiChoiceItemsDialog(Context context, String title, String[] items,
                                                String cancel, DialogInterface.OnClickListener onClickListener,
                                                String ok, DialogInterface.OnClickListener okClickListener,
                                                    boolean[] checkedItems, final DialogInterface.OnMultiChoiceClickListener multiChoiceClickListener) {
        AlertDialog.Builder builder = new AB(context);
        Dialog dialog = builder.setTitle(title)
                .setNegativeButton(cancel, onClickListener)
                .setPositiveButton(ok, okClickListener)
                .setMultiChoiceItems(items, checkedItems, multiChoiceClickListener)
                .create();
        dialog.show();
        return dialog;
    }

    public static Dialog showItemDialog(Context context, String title, String[] items,
                                        DialogInterface.OnClickListener onClickListener) {
        Dialog dialog = createItemDialog(context, title, items, onClickListener);
        dialog.show();
        return dialog;
    }

    public static Dialog createItemDialog(Context context, String title, String[] items,
                                          DialogInterface.OnClickListener onClickListener) {
        return createItemDialog(context, title, items, null, null, onClickListener);
    }

    public static Dialog createItemDialog(Context context, String title, String[] items, CharSequence ok, DialogInterface.OnClickListener okclick,
                                        DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AB(context);
        Dialog dialog = builder.setTitle(title)
                .setItems(items, onClickListener)
                .setPositiveButton(ok, okclick)
                .create();
        return dialog;
    }


    public interface RecyclerViewOnItemLongClickListener {
        boolean onItemLongClick(Dialog dialog, RecyclerView.ViewHolder baseViewHolder, View view, int position);
    }

    public static Dialog createCustomizeDialog(Activity context, View view, String title, String ok, DialogInterface.OnClickListener okClickListener,
                                               String cancel, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AB(context);
        Dialog dialog = builder.setTitle(title)
                .setView(view)
                .setNegativeButton(cancel, onClickListener)
                .setPositiveButton(ok, okClickListener)
                .create();
        return dialog;
    }

    public static class AB extends AlertDialog.Builder {

        public AB(@NonNull Context context) {
            super(context);
        }

        public AB(@NonNull Context context, @StyleRes int themeResId) {
            super(context, themeResId);
        }

        @Override
        public AlertDialog create() {
            return super.create();
        }
    }


    public static FragmentActivity getDialogActivity(DialogInterface dialog) {
        Dialog d = (Dialog) dialog;
        Context context = d.getContext();
        Activity activity = getActivity(context);
        if (activity == null) {
            activity = ActivityStackManager.getInstance().getCloneActivityStack().get(0);
        }
        return (FragmentActivity) activity;
    }

    public static Activity getActivity(Context context) {
        if (context instanceof Activity) return (Activity) context;
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

}

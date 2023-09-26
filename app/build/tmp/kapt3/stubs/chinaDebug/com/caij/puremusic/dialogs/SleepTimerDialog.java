package com.caij.puremusic.dialogs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\b\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020$H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/caij/puremusic/dialogs/SleepTimerDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lcom/caij/puremusic/databinding/DialogSleepTimerBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/DialogSleepTimerBinding;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "seekArcProgress", "", "seekBar", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "shouldFinishLastSong", "Landroid/widget/CheckBox;", "getShouldFinishLastSong", "()Landroid/widget/CheckBox;", "timerDisplay", "Landroid/widget/TextView;", "getTimerDisplay", "()Landroid/widget/TextView;", "timerUpdater", "Lcom/caij/puremusic/dialogs/SleepTimerDialog$TimerUpdater;", "makeTimerIntent", "Landroid/content/Intent;", "makeTimerPendingIntent", "Landroid/app/PendingIntent;", "flag", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "", "Landroid/content/DialogInterface;", "updateTimeDisplayTime", "TimerUpdater", "app_chinaDebug"})
public final class SleepTimerDialog extends androidx.fragment.app.DialogFragment {
    private int seekArcProgress = 0;
    private com.caij.puremusic.dialogs.SleepTimerDialog.TimerUpdater timerUpdater;
    private androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.DialogSleepTimerBinding _binding;
    
    public SleepTimerDialog() {
        super();
    }
    
    private final com.caij.puremusic.databinding.DialogSleepTimerBinding getBinding() {
        return null;
    }
    
    private final android.widget.CheckBox getShouldFinishLastSong() {
        return null;
    }
    
    private final android.widget.SeekBar getSeekBar() {
        return null;
    }
    
    private final android.widget.TextView getTimerDisplay() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void updateTimeDisplayTime() {
    }
    
    private final android.app.PendingIntent makeTimerPendingIntent(int flag) {
        return null;
    }
    
    private final android.content.Intent makeTimerIntent() {
        return null;
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/dialogs/SleepTimerDialog$TimerUpdater;", "Landroid/os/CountDownTimer;", "(Lcom/caij/puremusic/dialogs/SleepTimerDialog;)V", "onFinish", "", "onTick", "millisUntilFinished", "", "app_chinaDebug"})
    final class TimerUpdater extends android.os.CountDownTimer {
        
        public TimerUpdater() {
            super(0L, 0L);
        }
        
        @java.lang.Override()
        public void onTick(long millisUntilFinished) {
        }
        
        @java.lang.Override()
        public void onFinish() {
        }
    }
}
package com.caij.puremusic.views;

/**
 * View that shows an integer number. It provides a smooth roll animation on changing the
 * number.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000eJ\u0010\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/caij/puremusic/views/NumberRollView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDownNumber", "Landroid/widget/TextView;", "mLastRollAnimator", "Landroid/animation/Animator;", "mNumber", "", "mStringId", "", "mStringIdForZero", "mUpNumber", "endAnimationsForTesting", "", "getNumberRoll", "onFinishInflate", "setNumber", "number", "animate", "", "setNumberRoll", "setString", "stringId", "setStringForZero", "stringIdForZero", "setTextColorStateList", "colorStateList", "Landroid/content/res/ColorStateList;", "Companion", "app_chinaDebug"})
public final class NumberRollView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView mUpNumber;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView mDownNumber;
    private float mNumber = 0.0F;
    @org.jetbrains.annotations.Nullable()
    private android.animation.Animator mLastRollAnimator;
    private int mStringId = com.caij.puremusic.R.string.x_selected;
    private int mStringIdForZero = 0;
    
    /**
     * A Property wrapper around the `number` functionality handled by the
     * [NumberRollView.setNumberRoll] and [NumberRollView.getNumberRoll]
     * methods.
     */
    @org.jetbrains.annotations.NotNull()
    private static final android.util.Property<com.caij.puremusic.views.NumberRollView, java.lang.Float> NUMBER_PROPERTY = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.views.NumberRollView.Companion Companion = null;
    
    public NumberRollView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    /**
     * Sets a number to display.
     * @param animate Whether it should smoothly animate to the number.
     */
    public final void setNumber(int number, boolean animate) {
    }
    
    /**
     * @param stringId The id of the string to use for the description. The string must be a plural
     * that has one placeholder for a quantity.
     */
    public final void setString(int stringId) {
    }
    
    /**
     * @param stringIdForZero The id of the string to use for the description when the number is
     * zero.
     */
    public final void setStringForZero(int stringIdForZero) {
    }
    
    /**
     * Gets the current number roll position.
     */
    private final float getNumberRoll() {
        return 0.0F;
    }
    
    /**
     * Sets the number roll position.
     */
    private final void setNumberRoll(float number) {
    }
    
    /**
     * Ends any in-progress animations.
     */
    @androidx.annotation.VisibleForTesting()
    public final void endAnimationsForTesting() {
    }
    
    /**
     * Update the text color with [ColorStateList] for both [TextView].
     * @param resId The new text [ColorStateList] to use.
     */
    public final void setTextColorStateList(@org.jetbrains.annotations.Nullable()
    android.content.res.ColorStateList colorStateList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/views/NumberRollView$Companion;", "", "()V", "NUMBER_PROPERTY", "Landroid/util/Property;", "Lcom/caij/puremusic/views/NumberRollView;", "", "getNUMBER_PROPERTY", "()Landroid/util/Property;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * A Property wrapper around the `number` functionality handled by the
         * [NumberRollView.setNumberRoll] and [NumberRollView.getNumberRoll]
         * methods.
         */
        @org.jetbrains.annotations.NotNull()
        public final android.util.Property<com.caij.puremusic.views.NumberRollView, java.lang.Float> getNUMBER_PROPERTY() {
            return null;
        }
    }
}
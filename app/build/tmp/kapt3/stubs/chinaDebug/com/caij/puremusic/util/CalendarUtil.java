package com.caij.puremusic.util;

/**
 * @author Eugene Cheung (arkon)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/caij/puremusic/util/CalendarUtil;", "", "()V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "elapsedMonth", "", "getElapsedMonth", "()J", "elapsedToday", "getElapsedToday", "elapsedWeek", "getElapsedWeek", "elapsedYear", "getElapsedYear", "getDaysInMonth", "", "month", "getElapsedDays", "numDays", "getElapsedMonths", "numMonths", "Companion", "app_chinaDebug"})
public final class CalendarUtil {
    private final java.util.Calendar calendar = null;
    private static final long MS_PER_MINUTE = 60000L;
    private static final long MS_PER_DAY = 86400000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.CalendarUtil.Companion Companion = null;
    
    public CalendarUtil() {
        super();
    }
    
    public final long getElapsedToday() {
        return 0L;
    }
    
    public final long getElapsedWeek() {
        return 0L;
    }
    
    public final long getElapsedMonth() {
        return 0L;
    }
    
    /**
     * Returns the time elapsed so far this month and the last numMonths months in milliseconds.
     *
     * @param numMonths Additional number of months prior to the current month to calculate.
     * @return Time elapsed this month and the last numMonths months in milliseconds.
     */
    public final long getElapsedMonths(int numMonths) {
        return 0L;
    }
    
    public final long getElapsedYear() {
        return 0L;
    }
    
    /**
     * Gets the number of days for the given month in the given year.
     *
     * @param month The month (1 - 12).
     * @return The days in that month/year.
     */
    private final int getDaysInMonth(int month) {
        return 0;
    }
    
    /**
     * Returns the time elapsed so far last N days in milliseconds.
     *
     * @return Time elapsed since N days in milliseconds.
     */
    public final long getElapsedDays(int numDays) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/caij/puremusic/util/CalendarUtil$Companion;", "", "()V", "MS_PER_DAY", "", "MS_PER_MINUTE", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
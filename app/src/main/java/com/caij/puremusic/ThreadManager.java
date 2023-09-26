package com.caij.puremusic;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadManager {

    public static ThreadManager getInstance() {
        return Holder.sThreadManager;
    }

    private static class Holder  {
        static ThreadManager sThreadManager = new ThreadManager();
    }

    public static final int DEFAULT_PRIORITY = android.os.Process.THREAD_PRIORITY_BACKGROUND
            + android.os.Process.THREAD_PRIORITY_MORE_FAVORABLE;

    private static final int ALL_THREAD_COUNT = (int) Math.max(3, Runtime.getRuntime().availableProcessors() * 1.5f + 1);
    private static final int DISK_IO_THREAD_COUNT = Math.max(1, (int)(ALL_THREAD_COUNT * 1f / 4));
    private static final int NET_WORK_THREAD_COUNT = ALL_THREAD_COUNT - DISK_IO_THREAD_COUNT;

    public final Handler viewHandler;
    public final Handler ioHandler;
    public final Handler mainHandler = new Handler(Looper.getMainLooper());

    public ThreadPoolExecutor NET_WORK_EXECUTOR = new ThreadPoolExecutor(NET_WORK_THREAD_COUNT, NET_WORK_THREAD_COUNT + 4,
            40, TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>(),
            new ThreadFactory() {

                private final AtomicInteger mThreadId = new AtomicInteger(0);

                @Override
                public Thread newThread(@NotNull Runnable r) {
                    return new Thread(r, "see-network-" + mThreadId.getAndIncrement()) {
                        @Override
                        public void run() {
                            // why PMD suppression is needed: https://github.com/pmd/pmd/issues/808
                            android.os.Process.setThreadPriority(DEFAULT_PRIORITY); //NOPMD AccessorMethodGeneration
                            super.run();
                        }
                    };
                }
            });

    public ThreadPoolExecutor DISK_IO_EXECUTOR = new ThreadPoolExecutor(DISK_IO_THREAD_COUNT, DISK_IO_THREAD_COUNT,
            20, TimeUnit.SECONDS,
            new LinkedBlockingDeque<Runnable>(),
            new ThreadFactory() {

                private final AtomicInteger mThreadId = new AtomicInteger(0);

                @Override
                public Thread newThread(Runnable r) {
                    return new Thread(r, "see-disk-" + mThreadId.getAndIncrement()) {
                        @Override
                        public void run() {
                            // why PMD suppression is needed: https://github.com/pmd/pmd/issues/808
                            android.os.Process.setThreadPriority(DEFAULT_PRIORITY); //NOPMD AccessorMethodGeneration
                            super.run();
                        }
                    };
                }
            });

    private ThreadManager() {
        NET_WORK_EXECUTOR.allowCoreThreadTimeOut(true);
        DISK_IO_EXECUTOR.allowCoreThreadTimeOut(true);
        HandlerThread handlerThread = new HandlerThread("view_bg_handler");
        handlerThread.start();
        viewHandler = new Handler(handlerThread.getLooper());

        handlerThread = new HandlerThread("io_bg_handler");
        handlerThread.start();
        ioHandler = new Handler(handlerThread.getLooper());
    }

    public static ThreadPoolExecutor create(int max) {
        return new ThreadPoolExecutor(max, max,
                20, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(),
                new ThreadFactory() {

                    private final AtomicInteger mThreadId = new AtomicInteger(0);

                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r) {
                            @Override
                            public void run() {
                                // why PMD suppression is needed: https://github.com/pmd/pmd/issues/808
                                android.os.Process.setThreadPriority(DEFAULT_PRIORITY); //NOPMD AccessorMethodGeneration
                                super.run();
                            }
                        };
                    }
                });
    }
}

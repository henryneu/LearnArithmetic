package com.bkjk.base.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Author: zhouzhenhua
 * Date: 2019-03-20
 * Version: 1.0.0
 * Description:
 */
public class TestThread {

    static Integer count = 0;

    public static void main(String[] args) {

        //CountDownLatch

        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (count) {
                        count++;
                    }
                }
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(count);
    }

//    static int count = 0;
//
//    public static void main(String[] args) {
//
//        final Object o = new Object();
//        final CountDownLatch countDownLatch = new CountDownLatch(1000);
//        for (int i = 0; i < 1000; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    synchronized (o) {
//                        count++;
//                    }
//                    countDownLatch.countDown();
//                }
//            }).start();
//        }
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("count--->>>" + count);
//    }
}

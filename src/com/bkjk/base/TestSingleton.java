package com.bkjk.base;

import java.awt.*;

/**
 * Author: zhouzhenhua
 * Date: 2019-02-27
 * Version: 1.0.0
 * Description:
 */
public class TestSingleton {
    // 懒汉
//    private static TestSingleton sInstance;

//    private TestSingleton() {
//    }
//
//    public static synchronized TestSingleton getInstance() {
//        if (sInstance == null) {
//            sInstance = new TestSingleton();
//        }
//        return sInstance;
//    }

    // 饿汉
//    private static TestSingleton sInstance = new TestSingleton();
//
//    private TestSingleton() {
//    }
//
//    public static TestSingleton getInstance() {
//        return sInstance;
//    }

    // 双重校验锁
    private volatile static TestSingleton sInstance;
    private TestSingleton() {}

    public static TestSingleton getInstance() {
        if (sInstance == null) {
            synchronized (TestSingleton.class) {
                if (sInstance == null) {
                    sInstance = new TestSingleton();
                }
            }
        }
        return sInstance;
    }
}

package com.bkjk.base;

/**
 * Author: zhouzhenhua
 * Date: 2019-01-03
 * Version: 1.0.0
 * Description:
 */
public class StaticTest {

    private StaticTest() {
        x++;
        y++;
    }

//    private static StaticTest test = new StaticTest();

    public static StaticTest getInstance() {
        return test;
    }

    private static int x = 0;
    private static int y;

    private static StaticTest test = new StaticTest();

    public static void main(String[] args) {
        StaticTest staticTest = getInstance();
        System.out.println(staticTest.x);
        System.out.println(staticTest.y);

        String s1 = "This is a " + "simple" + "test!";
        System.out.println(s1);
    }
}

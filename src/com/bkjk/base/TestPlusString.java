package com.bkjk.base;

import sun.jvm.hotspot.memory.LoaderConstraintEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/**
 * Author: zhouzhenhua
 * Date: 2019-02-15
 * Version: 1.0.0
 * Description:
 */
public class TestPlusString {

    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
        //String s1 = "This is a " + "simple" + "test!";

        test2();

        final List list = new ArrayList();
        list.add("home loan");
        list.add("home aaaa");
        //list = new Vector();

        String s1 = "Hello";
        String s2 = "World!";
        String s3 = s1 + s2;
        String s4 = "HelloWorld!";

        //System.out.println(s3 == s4);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("a", "rrr1");
        map.put("b", "tt9");
        map.put("c", "tt8");
        map.put("d", "g7");
        map.put("e", "d6");
        map.put("f", "d4");
        map.put("g", "d4");
        map.put("h", "d3");
        map.put("i", "d2");
        map.put("j", "d1");
        map.put("k", "1");
        map.put("o", "2");
        map.put("p", "3");
        map.put("q", "4");
        map.put("r", "5");
        map.put("s", "6");
        map.put("t", "7");
        map.put("u", "8");
        map.put("v", "9");
        map.get("v");

        int temp = 16;
        System.out.println(tableSizeFor(temp));
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    private static String getA() {return "a";}

    public static void test2() {
        String a = "a";
        final String c = "a";

        String b = a + "b";
        String d = c + "b";
        String e = getA() + "b";

        String compare = "ab";
        System.out.println(b == compare);
        System.out.println(d == compare);
        System.out.println(e == compare);
    }
}

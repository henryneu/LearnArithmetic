package com.bkjk.base;

/**
 * Author: zhouzhenhua
 * Date: 2018/10/24
 * Version: 1.0.0
 * Description:
 */
public class PrintMultiplication {

//    public static void main(String []args) {
//        System.out.println("乘法口诀");
//
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + i * j + "  ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        String str1 = new String("ABCD").intern();
//        String str2 = new String("ABCD");
//        String str3 = new String("ABCD");
//        str2.intern();
//        str3.intern();
//
//        System.out.println(str2 == str3);
//
//        String str = "ABCD";
//        System.out.println(str1 == str);
//    }

    public static void main(String[] args) {
        String a = "hello2";

        final String b = "hello";
        String d = "hello";

        String c = b + 2;
        String e = d + 2;

        System.out.println(a == c);

        System.out.println(a == e);

//        System.out.println(c == e);
    }
}

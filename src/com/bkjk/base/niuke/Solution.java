package com.bkjk.base.niuke;

/**
 * Author: zhouzhenhua
 * Date: 2019-03-20
 * Version: 1.0.0
 * Description:
 */
public class Solution {
//    public int StrToInt(String str) {
//
//        if (str.equals("") || str.length() == 0) {
//            return 0;
//        }
//
//        int result = 0;
//        int sign = 0;
//
//        char[] tempChar = str.toCharArray();
//        if (tempChar[0] == '-') {
//            sign = 1;
//        }
//
//        for (int i = sign; i < tempChar.length; i++) {
//            if (tempChar[i] == '+') {
//                continue;
//            }
//            if (tempChar[i] < 48 || tempChar[i] > 57) {
//                return 0;
//            }
//            result = result * 10 + tempChar[i] - 48;
//        }
//
//        return sign == 0 ? result : result * -1;
//    }


    public static String LeftRotateString(String str, int n) {

        if (str.equals("") || str.length() == 0 || n > str.length()) {
            return "";
        }

        int length = str.length();

        n = n % length;

        str += str;

        return str.substring(n, length + n);
    }

    public static void main(String[] args) {
        String s = "abcXYZdef";
        System.out.println(s);
        String str = LeftRotateString(s, 3);
        System.out.println(str);

        int a = 10;
        int b = 12;

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}

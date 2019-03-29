package com.bkjk.base;

/**
 * Author: zhouzhenhua
 * Date: 2018/11/23
 * Version: 1.0.0
 * Description:
 */
public class Second extends First {
    public Second(){
        aMethod();
    }

    private void aMethod() {
        System.out.println("in Second class");
    }

    public static void main(String[] args) {
        new Second();
    }
}

class First {
    public First(){
        aMethod();
    }

    private void aMethod() {
        System.out.println("in First class");
    }
}

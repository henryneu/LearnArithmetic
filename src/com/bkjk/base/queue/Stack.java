package com.bkjk.base.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author: zhouzhenhua
 * Date: 2019-03-19
 * Version: 1.0.0
 * Description:两个队列实现栈
 */
public class Stack {

    Queue<Integer> queue1 = new ArrayDeque<Integer>();
    Queue<Integer> queue2 = new ArrayDeque<Integer>();

    public void push(Integer value) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(value);
            return;
        } else if (!queue1.isEmpty()) {
            queue1.add(value);
            return;
        } else {
            queue2.add(value);
            return;
        }
    }

    public Integer pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }

        if (queue1.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }

        if (queue2.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

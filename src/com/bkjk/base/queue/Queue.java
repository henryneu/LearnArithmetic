package com.bkjk.base.queue;

import java.util.Stack;

/**
 * Author: zhouzhenhua
 * Date: 2019-03-19
 * Version: 1.0.0
 * Description:两个栈实现队列
 */
public class Queue {

    Stack stack1 = new Stack<Integer>();
    Stack stack2 = new Stack<Integer>();

    public void enqueue(Integer value) {
        stack1.push(value);
    }

    public Integer dequeue() {
        if (stack2.size() <= 0) {
            while (stack1.size() > 0) {
                Integer temp = (Integer) stack1.peek();
                stack1.pop();
                stack2.push(temp);
                stack2.add(temp);
            }
        }

        if (stack2.size() == 0) {
            System.out.println("queue is empty");
        }

        Integer head = (Integer) stack2.peek();
        stack2.pop();

        return head;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

package com.bkjk.base.sort;

import java.util.Stack;

/**
 * Author: zhouzhenhua
 * Date: 2019-03-20
 * Version: 1.0.0
 * Description:
 */
public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 6, 9, 10, 8, 1, 7, 5};
        quickSort3(arr, 0, arr.length - 1);
        printArray(arr);
    }

    /**
     * 数组进行快速排序
     *
     * @param arr
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length < 2 || low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int key = arr[low];

        while (end > start) {
            //从后往前比较
            while (end > start && arr[end] >= key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (arr[end] <= key) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            //从前往后比较
            while (end > start && arr[start] <= key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (arr[start] >= key) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }

        // 递归调用
        if (start > low) quickSort(arr, low, start - 1);
        if (end < high) quickSort(arr, end + 1, high);
    }

    // 挖坑填数，分治
    public static void quickSort2(int[] arr, int low, int high) {
        if (arr == null || arr.length < 2 || low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int prvot = arr[low];

        while (end > start) {
            //从后往前比较
            while (end > start && arr[end] >= prvot)
                end--;
            if (arr[end] <= prvot) {
                arr[start++] = arr[end];
            }
            //从前往后比较
            while (end > start && arr[start] <= prvot)
                start++;
            if (arr[start] >= prvot) {
                arr[end--] = arr[start];
            }
        }

        arr[start] = prvot;
        // 递归调用
        quickSort2(arr, low, start - 1);
        quickSort2(arr, end + 1, high);
    }

    // 快排非递归
    public static void quickSort3(int[] arr, int low, int high) {
        if (arr == null || arr.length < 2 || low >= high) {
            return;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int i, j;
        stack.push(high);  // 先存右指针
        stack.push(low);   // 再存左指针
        while (!stack.empty()) {
            i = stack.peek();
            stack.pop();
            j = stack.peek();
            stack.pop();
            if (i < j) {
                int k = partition(arr, i ,j);
                if (k > i) {
                    stack.push(k - 1);
                    stack.push(i);
                }
                if (j > k) {
                    stack.push(j);
                    stack.push(k + 1);
                }
            }
        }
    }

    private static int partition(int[] data, int start, int end) {
        int index = start + (int)(Math.random() * (end - start + 1));
        swap(data, index, end);
        int small = start - 1;
        for (index = start; index < end; index++) {
            if (data[index] < data[end]) {
                small++;
                if (small != index) {
                    swap(data, index, small);
                }
            }
        }
        swap(data, small + 1, end);
        return small + 1;
    }

    /**
     * 交换数组中下标为i和j的两个元素的位置
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 输出打印数组中的元素
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

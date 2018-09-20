package com.bkjk.base;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 6, 9, 10, 8, 1, 7, 5};
        bubbleSort(arr);
        printArray(arr);
    }

    /**
     * 数组进行冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int length = arr.length;
        for (int j = length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
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

package com.bkjk.base;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 6, 9, 10, 8, 1, 7, 5};
        selectionSort(arr);
        printArray(arr);
    }

    /**
     * 数组进行选择排序
     *
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int smallIndex = i;
            for (int j = i + 1; j < length; j ++) {
                if (arr[smallIndex] > arr[j]) {
                    smallIndex = j;
                }
            }
            swap(arr, smallIndex, i);
        }
    }

    /**
     * 交换数组中下标为i和j的两个元素的位置
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 输出打印数组中的元素
     *
     * @param arr
     */
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

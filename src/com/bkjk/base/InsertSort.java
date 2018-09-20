package com.bkjk.base;

public class InsertSort {

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 6, 9, 10, 8, 1, 7, 5};
        insertSort(arr);
        printArray(arr);
    }

    /**
     * 数组进行插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
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

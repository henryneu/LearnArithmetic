package com.bkjk.base.search;

/**
 * Author: zhouzhenhua
 * Date: 2019-03-08
 * Version: 1.0.0
 * Description:二分查找，前提是有序数组
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10};
        int index = binarySearch(arr, 6);
        System.out.println(index);
        int firstIndex = binarySearchFirst(arr, 5);
        System.out.println(firstIndex);
        int lastIndex = binarySearchLast(arr, 5);
        System.out.println(lastIndex);
        //printArray(arr);
    }

    /**
     * 二分查找
     *
     * @param arr 查询数组
     * @param num 待查询数字
     * @return 查询到的数字在数组中的下标
     */
    public static int binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (num == arr[middle]) {
                return middle;
            } else if (num > arr[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }

    /**
     * 二分查找,查找第一个与key值相等的元素
     *
     * @param arr 查询数组
     * @param num 待查询数字
     * @return 查询到的数字在数组中的下标
     */
    public static int binarySearchFirst(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (num <= arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        if (low < arr.length && arr[low] == num) {
            return low;
        }

        return -1;
    }

    /**
     * 二分查找,查找最后一个与key值相等的元素
     *
     * @param arr 查询数组
     * @param num 待查询数字
     * @return 查询到的数字在数组中的下标
     */
    public static int binarySearchLast(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (num >= arr[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        if (high < arr.length && arr[high] == num) {
            return high;
        }

        return -1;
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

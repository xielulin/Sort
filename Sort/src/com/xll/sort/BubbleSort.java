package com.xll.sort;

import java.util.Arrays;

/**
 * @ClassName: BubbleSort
 * @Description: 冒泡排序
 * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)
 * 平均情况：T(n) = O(n2)
 * @author: XieLulin
 * @date: 2018年3月11日 下午2:11:36
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 7, 6, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param @param arr
     * @return void
     * @throws
     * @Title: sort
     * @Description: 冒泡排序
     */
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }

        }
    }

    /**
     * @param @param arr
     * @param @param i
     * @return void
     * @throws
     * @Title: swap
     * @Description: 交换数组相邻的两个元素
     */
    private static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
}

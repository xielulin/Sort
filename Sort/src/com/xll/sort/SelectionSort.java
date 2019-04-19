package com.xll.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @ClassName: SelectionSort
 * @Description: 将无序中最大或最小的插入到有序队列的末尾
 * 时间复杂度：最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
 * 最稳定的排序算法
 * @author: XieLulin
 * @date: 2018年3月11日 下午2:57:40
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 4, 7, 9, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param @param arr
     * @return void
     * @throws
     * @Title: sort
     * @Description: 选择排序                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     排序
     */
    private static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[index] > arr[j]) {//选出最小值的位置
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}

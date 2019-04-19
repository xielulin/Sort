package com.xll.sort;

import java.util.Arrays;

/**
 * @ClassName: MergerSort
 * @Description: 归并排序
 * 分而治之(divide - conquer);每个递归过程涉及三个步骤
 * 第一, 分解: 把待排序的 n 个元素的序列分解成两个子序列, 每个子序列包括 n/2 个元素.
 * 第二, 治理: 对每个子序列分别调用归并排序MergeSort, 进行递归操作
 * 第三, 合并: 合并两个排好序的子序列,生成排序结果.
 * @author: XieLulin
 * @date: 2018年3月11日 下午10:06:59
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 4, 7, 9, 8};
        int i = 1;
        arr[i++] = 999;
        System.out.println("arr[1]:" + arr[1]);
        System.out.println(arr[i]);
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            //左右归并
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[(right - left + 1)];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            //如果左边的值小，就把左边的放入临时数组中，否则，将右边的放入临时数组
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //将左边的数移入数组
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //将右边的数移入数组
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        //把新数组的数覆盖原数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + left] = temp[k2];
        }
    }
}

package com.xll.sort;

import java.util.Arrays;

/**
 * @ClassName: QuickSort
 * @Description: 从数列中挑出一个元素，称为 “基准”（pivot）；
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，
 * 所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * @author: XieLulin
 * @date: 2018年3月11日 下午10:43:57
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 4, 7, 9, 8};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = part(arr, left, right);//分割数组
            sort(arr, left, pivot - 1);  //递归排序左子数组
            sort(arr, pivot + 1, right); //递归排序右子数组
        }
    }

    /**
     * @param arr
     * @param left
     * @param right
     * @param
     * @return 枢轴位置
     * @throws
     * @Title: part
     * @Description: 分割数组
     */
    private static int part(int[] arr, int left, int right) {
        int pivot = arr[left]; //记录枢轴
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                --right;
            }
            arr[left] = arr[right]; //比枢轴小的放左边
            while (left < right && arr[left] <= pivot) {
                ++left;
            }
            arr[right] = arr[left];  //比枢轴大的放右边
        }
        arr[left] = pivot; //扫描完成，枢轴到位
        return left;    //返回枢轴的位置
    }


}

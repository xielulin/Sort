package com.xll.sort;

import java.util.Arrays;

 /** 插入排序
 * @ClassName: InsertionSort 
 * @Description: 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 * @author: XieLulin
 * @date: 2018年3月11日 下午3:46:38  
 */
public class InsertionSort {
	public static void main(String[] args) {
		int [] arr ={1,3,2,6,5,4,7,9,8,15,76,45,23};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 
	* @Title: sort  
	* @Description: 插入排序算法
	* @param @param arr       
	* @return void     
	* @throws
	 */
	private static void sort(int[] arr) {
		int length=arr.length;
		for(int i=0;i<length-1;i++){
			for(int j=i+1;j>0;j--){
				if(j-1>=0&&arr[j]>arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else{
					break;
				}
			}
		}
	}
}

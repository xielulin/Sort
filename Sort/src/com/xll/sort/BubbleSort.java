package com.xll.sort;

import java.util.Arrays;

 /** 
 * @ClassName: BubbleSort 
 * @Description: ð������
 * ��������T(n) = O(n)   ��������T(n) = O(n2) 
 *   ƽ�������T(n) = O(n2)
 * @author: XieLulin
 * @date: 2018��3��11�� ����2:11:36  
 */
public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {3,1,5,2,7,6,9};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 
	* @Title: sort  
	* @Description: ð������
	* @param @param arr       
	* @return void     
	* @throws
	 */
	private static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j);
				}
			}
			
		}
	}

	/**
	 * 
	* @Title: swap  
	* @Description: �����������ڵ�����Ԫ�� 
	* @param @param arr
	* @param @param i       
	* @return void     
	* @throws
	 */
	private static void swap(int[] arr, int i) {
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
}

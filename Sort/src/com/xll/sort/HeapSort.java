package com.xll.sort;

import java.util.Arrays;

  /** 
 * @ClassName: HeapSort 
 * @Description: 堆排序算法的实现
 * @author: 小小调琴师
 * @date: 2018年3月10日 下午11:18:38  
 */
public class HeapSort {

	public static void main(String[] args) {
		int [] arr = {10,15,5,7,24};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 
	* @Title: sort  
	* @Description: 堆排序  
	* @param @param arr   待排序的数组
	* @return void    
	* @throws
	 */
	private static void sort(int[] arr) {
		for(int i=arr.length/2-1;i>=0;i--){//构建大顶堆,从第一个非叶子节点，从下至上调整
			adjustHeap(arr, i, arr.length);
		}
		
		for(int j=arr.length-1;j>0;j--){
			swap(arr, 0, j);
			adjustHeap(arr, 0, j);
		}
	}
	
	
	
	
	/**  
	* @Title: adjustHeap  
	* @Description: 将数组调整为堆
	* @param @param arr 待调整的数组
	* @param @param i 当前待调整的元素
	* @param @param length  待调整数组的待调整长度     
	* @return void     
	* @throws  
	*/ 
	private static void adjustHeap(int arr[],int i,int length){
		int temp = arr[i];
		for(int k=2*i+1;k<length;k=2*k+1){
			if(k+1<length&&arr[k]<arr[k+1]){//如果左子节点小于右子节点，k指向右子节点
				k++;
			}
			if(arr[k]>temp){
				arr[i]=arr[k];
				i=k;
			}else{
				break;
			}
		}
		arr[i]=temp;
	}
	
	/**  
	* @Title: swap  
	* @Description: 交换  
	* @param @param arr 
	* @param @param a
	* @param @param b       
	* @return void     
	* @throws  
	*/ 
	private static void swap(int []arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}

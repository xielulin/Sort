package com.xll.sort;

import java.util.Arrays;

  /** 
 * @ClassName: HeapSort 
 * @Description: 堆排序算法的实现
 * 堆排序是一种选择排序，
 * 整体主要由构建初始堆+交换堆顶元素和末尾元素并重建堆两部分组成。
 * 其中构建初始堆经推导复杂度为O(n)，在交换并重建堆的过程中，
 * 需交换n-1次，而重建堆的过程中，根据完全二叉树的性质，
 * [log2(n-1),log2(n-2)...1]逐步递减，近似为nlogn。
 * 所以堆排序时间复杂度一般认为就是O(nlogn)级
 *  算法步骤：
 * 1）创建一个堆H[0..n-1]
 * 2）把堆首（最大值）和堆尾互换
 * 3）把堆的尺寸缩小1，并调用adjustHeap(),目的是把新的数组顶端数据调整到相应位置
 * 4） 重复步骤2，直到堆的尺寸为1
 * @author XieLulin
 * @date: 2018年3月10日 下午11:18:38  
 */
public class HeapSort {

	public static void main(String[] args) {
		int [] arr = {10,15,5,7,24,21,45,32,1,6,54};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 
	* @Title: sort  
	* @Description: 堆排序
	* @param @param arr 待排序的数组
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
	* @Description: 将数组调整为堆 堆是一个近似完全二叉树的结构，并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。
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

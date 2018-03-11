package com.xll.sort;

import java.util.Arrays;

 /** 
 * @ClassName: ShellSort 
 * @Description: 希尔排序
 * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 按增量序列个数k，对序列进行k 趟排序；
 * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，
 * 分别对各子表进行直接插入排序。仅增量因子为1 时，
 * 整个序列作为一个表来处理，表长度即为整个序列的长度。
 * @author: XieLulin
 * @date: 2018年3月11日 下午5:10:05  
 */
public class ShellSort {
	public static void main(String[] args) {
		int [] arr ={1,3,2,6,5,4,7,9,8};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**  
	* @Title: sort  
	* @Description: 希尔排序
	* @param @param arr       
	* @return void     
	* @throws  
	*/ 
	private static void sort(int[] arr) {
		 for(int gap=arr.length/2;gap>0;gap/=2){
	           //从第gap个元素，逐个对其所在组进行直接插入排序操作
	           for(int i=gap;i<arr.length;i++){
	               int j = i;
	               while(j-gap>=0 && arr[j]<arr[j-gap]){
	                   //插入排序采用交换法
	                   swap(arr,j,j-gap);
	                   j-=gap;
	               }
	           }
	       }
	}

	/**  
	* @Title: swap  
	* @Description: 交换两个数组元素的值
	* @param @param arr
	* @param @param j
	* @param @param i       
	* @return void     
	* @throws  
	*/ 
	private static void swap(int[] arr, int j, int i) {
		arr[j]=arr[j]+arr[i];
		arr[i]=arr[j]-arr[i];
		arr[j]=arr[j]-arr[i];
	}
}

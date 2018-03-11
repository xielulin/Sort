package com.xll.sort;

import java.util.Arrays;

  /** 
 * @ClassName: HeapSort 
 * @Description: �������㷨��ʵ��
 * @author: СС����ʦ
 * @date: 2018��3��10�� ����11:18:38  
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
	* @Description: ������  
	* @param @param arr   �����������
	* @return void    
	* @throws
	 */
	private static void sort(int[] arr) {
		for(int i=arr.length/2-1;i>=0;i--){//�����󶥶�,�ӵ�һ����Ҷ�ӽڵ㣬�������ϵ���
			adjustHeap(arr, i, arr.length);
		}
		
		for(int j=arr.length-1;j>0;j--){
			swap(arr, 0, j);
			adjustHeap(arr, 0, j);
		}
	}
	
	
	
	
	/**  
	* @Title: adjustHeap  
	* @Description: ���������Ϊ��
	* @param @param arr ������������
	* @param @param i ��ǰ��������Ԫ��
	* @param @param length  ����������Ĵ���������     
	* @return void     
	* @throws  
	*/ 
	private static void adjustHeap(int arr[],int i,int length){
		int temp = arr[i];
		for(int k=2*i+1;k<length;k=2*k+1){
			if(k+1<length&&arr[k]<arr[k+1]){//������ӽڵ�С�����ӽڵ㣬kָ�����ӽڵ�
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
	* @Description: ����  
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

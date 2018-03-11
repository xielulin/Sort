package com.xll.sort;

import java.util.Arrays;

/**
 * ѡ������
 * @ClassName: SelectionSort 
 * @Description: ��������������С�Ĳ��뵽������е�ĩβ
 * ʱ�临�Ӷȣ���������T(n) = O(n2)  ��������T(n) = O(n2)  ƽ�������T(n) = O(n2)
 * ���ȶ��������㷨
 * @author: XieLulin
 * @date: 2018��3��11�� ����2:57:40
 */
public class SelectionSort {
	public static void main(String[] args) {
		int [] arr ={1,3,2,6,5,4,7,9,8};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**  
	* @Title: sort  
	* @Description: ѡ������                                                                                                                                                                                                 																																																																																																																																																																																																																																																																																																																																																																																																																																																																								                                                     ����
	* @param @param arr       
	* @return void     
	* @throws  
	*/ 
	private static void sort(int[] arr) {
		int length=arr.length;
		for(int i=0;i<length-1;i++){
			int index=i;
			for(int j=i+1;j<length;j++){
				 if(arr[index]>arr[j]){//ѡ����Сֵ��λ��
					 index=j;
				 }
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
	}
}

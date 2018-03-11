package com.xll.sort;

import java.util.Arrays;

 /** ��������
 * @ClassName: InsertionSort 
 * @Description: �ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
 * ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�裻
 * �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ�ã�
 * �ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ�ã�
 * ����Ԫ�ز��뵽��λ�ú�
 * �ظ�����2~5��
 * @author: XieLulin
 * @date: 2018��3��11�� ����3:46:38  
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
	* @Description: ���������㷨
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

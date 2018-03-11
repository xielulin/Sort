package com.xll.sort;

import java.util.Arrays;

/**
 * 
 * @ClassName: MergerSort 
 * @Description: �鲢����
 * �ֶ���֮(divide - conquer);ÿ���ݹ�����漰��������
 * ��һ, �ֽ�: �Ѵ������ n ��Ԫ�ص����зֽ������������, ÿ�������а��� n/2 ��Ԫ��.
 * �ڶ�, ����: ��ÿ�������зֱ���ù鲢����MergeSort, ���еݹ����
 * ����, �ϲ�: �ϲ������ź����������,����������.
 * @author: XieLulin
 * @date: 2018��3��11�� ����10:06:59
 */
public class MergeSort {
	public static void main(String[] args) {
		int [] arr ={1,3,2,6,5,4,7,9,8};
		int i=1;
		arr[i++]=999;
		System.out.println("arr[1]:"+arr[1]);
		System.out.println(arr[i]);
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr,int left,int right) {
		int mid=(left+right)/2;
		if(left<right){
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			//���ҹ鲢
			merge(arr,left,mid,right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int [] temp = new int [(right-left+1)];
		int i = left;
		int j = mid+1;
		int k = 0;
		while(i<=mid&&j<=right){
			//�����ߵ�ֵС���Ͱ���ߵķ�����ʱ�����У����򣬽��ұߵķ�����ʱ����
			if(arr[i]<arr[j]){
				temp[k++] = arr[i++];
			}else{
				temp[k++] = arr[j++];
			}
		}
		//����ߵ�����������
		while(i<=mid){
			temp[k++]=arr[i++];
		}
		
		//���ұߵ�����������
		while(j<=right){
			temp[k++] = arr[j++];
		}
		
		//���������������ԭ����
		for (int k2 = 0; k2 < temp.length; k2++) {
			arr[k2+left]=temp[k2];
		}
	}
}

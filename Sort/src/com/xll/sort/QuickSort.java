package com.xll.sort;

import java.util.Arrays;

 /** 
 * @ClassName: QuickSort 
 * @Description: 
 * ������������һ��Ԫ�أ���Ϊ ����׼����pivot����
 * �����������У�����Ԫ�رȻ�׼ֵС�İڷ��ڻ�׼ǰ�棬
 * ����Ԫ�رȻ�׼ֵ��İ��ڻ�׼�ĺ��棨��ͬ�������Ե���һ�ߣ���
 * ����������˳�֮�󣬸û�׼�ʹ������е��м�λ�á������Ϊ������partition��������
 * �ݹ�أ�recursive����С�ڻ�׼ֵԪ�ص������кʹ��ڻ�׼ֵԪ�ص�����������
 * @author: XieLulin
 * @date: 2018��3��11�� ����10:43:57  
 */
public class QuickSort {
	public static void main(String[] args) {
		int [] arr ={1,3,2,6,5,4,7,9,8};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, int left, int right) {
		if(left<right){
			int pivot = part(arr,left,right);//�ָ�����
			sort(arr,left,pivot-1);  //�ݹ�������������
			sort(arr,pivot+1,right); //�ݹ�������������
		}
	}

	/**  
	* @Title: part  
	* @Description: �ָ�����
	* @param   arr
	* @param   left
	* @param   right
	* @param   
	* @return   ����λ�� 
	* @throws  
	*/ 
	private static int part(int[] arr, int left, int right) {
		int pivot =arr[left]; //��¼����
		 while(left<right){
			 while(left<right && arr[right]>=pivot ){
				 --right;
			 }
			 arr[left]=arr[right]; //������С�ķ����
			 while(left<right &&arr[left]<=pivot ){
				 ++left;
			 }
			 arr[right]=arr[left];  //�������ķ��ұ�
		 }
		 arr[left]=pivot ; //ɨ����ɣ����ᵽλ
		 return left;	//���������λ��
	}

	 
}

package com.xll.sort;

import java.util.Arrays;

 /** 
 * @ClassName: ShellSort 
 * @Description: ϣ������
 * ѡ��һ����������t1��t2������tk������ti>tj��tk=1��
 * ���������и���k�������н���k ������
 * ÿ�����򣬸��ݶ�Ӧ������ti�����������зָ�����ɳ���Ϊm �������У�
 * �ֱ�Ը��ӱ����ֱ�Ӳ������򡣽���������Ϊ1 ʱ��
 * ����������Ϊһ�������������ȼ�Ϊ�������еĳ��ȡ�
 * @author: XieLulin
 * @date: 2018��3��11�� ����5:10:05  
 */
public class ShellSort {
	public static void main(String[] args) {
		int [] arr ={1,3,2,6,5,4,7,9,8};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**  
	* @Title: sort  
	* @Description: ϣ������
	* @param @param arr       
	* @return void     
	* @throws  
	*/ 
	private static void sort(int[] arr) {
		 for(int gap=arr.length/2;gap>0;gap/=2){
	           //�ӵ�gap��Ԫ�أ�����������������ֱ�Ӳ����������
	           for(int i=gap;i<arr.length;i++){
	               int j = i;
	               while(j-gap>=0 && arr[j]<arr[j-gap]){
	                   //����������ý�����
	                   swap(arr,j,j-gap);
	                   j-=gap;
	               }
	           }
	       }
	}

	/**  
	* @Title: swap  
	* @Description: ������������Ԫ�ص�ֵ
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

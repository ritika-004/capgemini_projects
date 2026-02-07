package com.uem;

public class leftRotateArray {
	public static void rotate(int[] arr, int k)
	{
		int n=arr.length;
		k=k%n;
		int index=0; 
		int[] temp= new int[n];
		for(int i=k;i<n;i++)
		{
			temp[index++]=arr[i];
		}
		for(int i=0;i<k;i++)
			temp[index++]=arr[i];
		
		for(int i=0;i<n;i++)
			arr[i]=temp[i];
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int k=2;
		rotate(arr,k);
		for(int i:arr)
			System.out.print(i+" ");
	}

}

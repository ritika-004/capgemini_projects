package com.uem;

public class BubbleSort {
	static void sort(int[]arr)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
			}
		}
	}
	
	public static void main(String[] args) {
		int [] arr= {2,5,3,6,1,4};
		sort(arr);
		System.out.println("Sorted elements :");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}

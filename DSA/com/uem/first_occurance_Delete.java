package com.uem;

public class first_occurance_Delete {
	public static void main(String[] args) {
		int[] arr= {10,60,20,40,30};
		int index=0;
		int ele=60;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
			      index=i;
		          break;
			}
		}
		
		
		for(int i=index;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}

}

}

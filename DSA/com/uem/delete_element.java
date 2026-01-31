package com.uem;

public class delete_element {
	public static void main(String[] args) {
		int[] arr= {10,60,20,40,30};
		
		int index=3;
		
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


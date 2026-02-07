package com.uem;

public class findmissing {
	static int find(int[]arr)
	{
		int low=0;
		int high=arr.length-1;
		
		int start=arr[0];
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==start+mid)
				low=mid+1;
			else
				high=mid-1;
			
		}
		return start+low;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6};
		int missing=find(arr);
		System.out.println("Missing value : "+missing);
	}

}

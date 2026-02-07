package com.uem;

import java.util.HashSet;

public class removeDuplicate {
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,2,1,4,5};
		HashSet<Integer> set= new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
			set.add(arr[i]);
		
		for(int i:set)
			System.out.print(i+" ");
	}

}

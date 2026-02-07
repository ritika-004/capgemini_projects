package com.uem;

import java.util.HashMap;

public class countFreq {
	public static void main(String[] args) {
		int [] arr= {1,2,1,2,5,4,4,4,1,2};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
			
		}
		for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
	}

}

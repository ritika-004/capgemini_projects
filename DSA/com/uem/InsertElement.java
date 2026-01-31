package com.uem;

public class InsertElement {
	public static void main(String[] args) {
	int[] a= {10,30,8,6,7,2};
	int[] a1=new int[a.length +1];
	int index=3,e=40;
	
	for(int i =0;i<a1.length;i++) {
		if(i<index) {
			a1[i]=a[i];
		} else if (i== index) {
			a1[i]=e;
		}
		else {
			a1[i]=a[i-1];
		}
	}
	for(int i =0;i<a1.length;i++) {
		System.out.println(a1[i] + " ");
	}
	}
}
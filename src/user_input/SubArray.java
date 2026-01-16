package user_input;

import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= {1,2,3};
		int sum=0;
		for(int start=0;start<arr.length;start++)
		{
			for(int end=start;end<arr.length;end++)
			{
				System.out.print("[");
				for(int k=start;k<=end;k++)
				{
					System.out.print(arr[k]+ " ");
					sum+=arr[k];
				}
				System.out.println("]");
				System.out.println();
			}
		}
		System.out.println(sum);
	}

}

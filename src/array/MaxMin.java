package array;

public class MaxMin {
	public static void main(String[]args)
	{
		int[]arr= {5,6,3,2,1};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		int d=max-min;
		System.out.println("max = " +max);
		System.out.println("min = " +min);
		System.out.println("Difference = " +d);
	}
	

}

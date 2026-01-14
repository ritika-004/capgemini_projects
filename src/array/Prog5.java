package array;

public class Prog5 {
	public static void main(String[]args)
	{
		int[] arr=new int[5];
		System.out.println(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		arr[0]=10;
		arr[1]=21;
		arr[2]=2;
		arr[3]=8;
		arr[4]=9;
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

}

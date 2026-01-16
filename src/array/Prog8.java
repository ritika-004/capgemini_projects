package array;

public class Prog8 {
	public static int[] demo(int [] a)
	{
		int[]b= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]*3;
		}
		return b;
		
	}
	public static void main(String[]args)
	{
		int [] a= {10,20,30};
		int[] res= demo(a);
		
		
		
		
	}

}

package method;

public class Pattern {
	public static void main(String[]args)
	{
		int spaces=0;
		for(int i=5;i>=1;i-=2)
		{
			for(int s=0;s<spaces;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces++;
		}
	}

}

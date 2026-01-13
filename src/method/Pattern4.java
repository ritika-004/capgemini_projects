package method;

public class Pattern4 {
	public static void main(String[]args)
	{
		int n=3;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=2*n-1;col++)
			{
				if(col<=(4-row) || col>=2+row)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}

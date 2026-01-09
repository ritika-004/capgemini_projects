package loops.whileloop;

public class neonnumber {
	public static void main(String[]args)
	{
		int n=9;int sum=0;
		int sq=n*n;
		while(sq>0)
		{
			sum+=sq%10;
			sq/=10;
		   
		}
		if(sum==n)
			System.out.println("Neon number");
		else
			System.out.println("Not a neon number");

}
}

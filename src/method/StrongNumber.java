package method;

public class StrongNumber {
	public static void isStrong(int n)
	{
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
		    int fact=1;
		    for(int i=1;i<=d;i++)
			   fact*=i;
		    sum+=fact;
		    n/=10;
		}
		if(sum==temp)
			System.out.println("Strong number");
		else
			System.out.println("not strong number");
			
	}
	public static void main(String[]args)
	{
		int n=145;
		isStrong(n);
	}

}

package loops.whileloop;

public class spynumber {
	public static void main(String[]args)
	{//sum of all digits=prod of all digits}
		int n=123;int sum=0;int prod=1;
		while(n>0)
		{
			int d=n%10;
			sum+=d;
			prod*=d;
			n/=10;
		}
		System.out.println(sum);
		System.out.println(prod);
		if(sum==prod)
			System.out.println("spy number");
		else
			System.out.println("not spy number");

}
}

package loops.whileloop;

public class perefct {
	public static void main(String[]args)
	{
		int num=28;int i=1;int sum=0;
		while(i<num)//for(i=1;i<num;i++)
		{
			if(num%i==0)
				sum+=i;
			i++;
		}
		if(sum==num)
			System.out.println("Perfect number");
		else
			System.out.println("not perfect number");
	}

}

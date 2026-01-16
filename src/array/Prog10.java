package array;

public class Prog10 {
	public static void main(String[] args) {
		int[][]a= {{7,9},{4,2}};
		int[][]b= {{1,2},{3,1}};
		int[][] res=sum(a,b);
		
		print(res);
	}
	public static void print(int[][]arr)
    {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	
    }
	public static int[][]sum(int[][]a,int[][]b)
	{
		int row=a.length;
		int col=a[0].length;
		int[][] res=new int[row][col];
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		return res;
	}

}

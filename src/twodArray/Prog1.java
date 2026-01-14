package twodArray;

public class Prog1 {
	public static void main(String[]args)
	{
		int[][] a= {{100,1},{200,2}};
		for(int i=0;i<a.length;i++) {//single array
			for(int j=0;j<a[i].length;j++) {//elements inside array
			System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}

}

package array_Test2;

import java.util.Arrays;

public class ArrCopy {
	public static void copy(int a[][])
	{
		
		for(int i=0;i<a.length;i++)
		{
			int b=a[0].length-1;
			for(int j=0;j<a[i].length/2;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[i][b];
				a[i][b]=temp;
				b--;
			}
		}
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int Arr[][]= {{1,2,3,4},{5,6,7,8}};
		
		ArrCopy.copy(Arr);
	}

}

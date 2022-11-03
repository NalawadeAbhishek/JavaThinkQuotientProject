package array_Test2;

public class RowMax {

	public static void rowmax(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int max=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ="+max);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int a[][]= {{22,31,9},{12,25,16}};
		
		RowMax.rowmax(a);
	}

}

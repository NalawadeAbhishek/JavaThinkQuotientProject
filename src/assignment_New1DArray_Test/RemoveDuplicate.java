package assignment_New1DArray_Test;

public class RemoveDuplicate {
	
	public static void duplicate(int a[])
	{
		int d[]=new int[15];
		int m=0;
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean flag=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
			d[m]=a[i];
			m++;
			}
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(d[i]);
		}
	}
	
	public static void main(String []args)
	{
		int a[]={1,2,3,2,4,5,5,6,7,8,9,9};
		duplicate(a);
	}

}

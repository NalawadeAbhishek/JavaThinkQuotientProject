package array_Test2;

public class Frequency {
	
	public static void frequency(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(a[i]+" "+count);
			}
			}
		}
	}
	
	public static void main(String[]args)
	{
		int a[]= {1,2,5,2,3,4,9,5,3};
		Frequency.frequency(a);
		
	}

}

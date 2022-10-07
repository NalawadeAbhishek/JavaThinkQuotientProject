package assignment_New1DArray_Test;
import java.util.*;

public class CountEvenOdd {
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element of array");
		int Arr[]=new int[size];
		int count=0;
		int count1=0;
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]%2==0)
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("Count even element are ="+count);
		System.out.println("Count odd element are ="+count1);
	}

}

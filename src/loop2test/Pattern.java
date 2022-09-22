package loop2test;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		//0		3	8	15	24	35	48....
		/*Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int ans=0;
		for(int i=1;i<=num;i++)
		{
			ans=i*i-1;
			System.out.print(ans+" ");
		}*/
		
		
		/*int a=10;
		int b=1;
		int ans=0;
		for(int i=1;i<=5;i++)
		{										//1
			b=b*10;								//22
			ans=b/9;							//333
			int j=ans*i;						//4444
			System.out.println(j);				//55555
		}*/
		
		/*for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)				//1
			{									//21
				if(i>=j)						//321
				{								//4321
					System.out.print(j);		//54321
				}
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)				//        1
			{									//      1 0
				System.out.print(" ");			//    1 0 1
			}									//  1 0 1 0
			for(int j=1;j<=i;j++)				//1 0 1 0 1	
			{
				if(j%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
	}

}

package loop_and_switch_assignment;

public class Pattern {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=4;i++)
		{										//*
			for(int j=1;j<=i;j++)				//**
			{									//***
				System.out.print("*");			//****
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)				//   *
			{									//  **
				System.out.print(" ");			// ***
			}									//****
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{										//   *
			for(int k=4;k>=i;k--)				//  * *
			{									// * * *
				System.out.print(" ");			//* * * *
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}*/

		/*for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)				//****
			{									//***
				System.out.print("*");			//**
			}									//*
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)				//****
			{									// ***
				System.out.print(" ");			//  **
			}									//   *
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)					//* * * *
			{										// * * *
				System.out.print(" ");				//  * *
			}										//   *
			for(int j=4;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{									//   *
				System.out.print(" ");			//  * *
			}									// * * *
			for(int j=1;j<=i;j++)				//* * * *
			{									// * * *
				System.out.print(" *");			//  * *
			}									//   *
			System.out.println();				
		}
		for(int i=1;i<=4;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");	
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print(" *");	
			}
			System.out.println();	
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");	
			}
			for(int j=4;j>=i;j--)
			{									//* * * *
				System.out.print(" *");			// * * *
			}									//  * *
			System.out.println();				//   *
		}										//   *
		for(int i=1;i<=4;i++)					//  * *
		{										// * * *
			for(int k=4;k>=i;k--)				//* * * *
			{
				System.out.print(" ");			
			}									
			for(int j=1;j<=i;j++)				
			{									
				System.out.print(" *");			
			}									
			System.out.println();				
		}*/
		
		/*int a=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)				//1
			{									//2  3
				System.out.print(a+" ");		//4  5  6
				a++;							//7  8  9  10
			}									//11 12 13 14 15
			System.out.println();				//16 17 18 19 20 21
		}*/										//22 23 24 25 26 27 28
		
		/*for(char i='A';i<='I';i++)			//A
		{										//AB
			for(char j='A';j<=i;j++)			//ABC
			{									//ABCD
				System.out.print(j);			//ABCDE
			}									//ABCDEF
			System.out.println();				//ABCDEFG
		}*/
		
		/*for(char i='A';i<='J';i++)			//A
		{										//BB
			for(char j='A';j<=i;j++)			//CCC
			{									//DDDD
				System.out.print(i);			//EEEEE
			}									//FFFFFF
			System.out.println();				//GGGGGGG
		}*/										//HHHHHHHH
		
		
	}

}

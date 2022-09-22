package praticeprograms;

public class Pattren_Demo {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=4;i++)
		{									//4321
			for(int j=4;j>=i;j--)			//432
			{								//43
				System.out.print(j);		//4
			}
			System.out.println();
		}*/
		
		
		/*for(int i=1;i<=4;i++)
		{									//****
			for(int j=4;j>=i;j--)			//***
			{								//**
				System.out.print("*");		//*
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{									//1111
			for(int j=4;j>=i;j--)			//222
			{								//33
				System.out.print(i);		//4
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{									//1111
			for(int j=1;j<=4;j++)			//2222
			{								//3333
				System.out.print(i);		//4444
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{									//1234
			for(int j=1;j<=4;j++)			//1234
			{								//1234
				System.out.print(j);		//1234
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{										//1
				if(j%2==0)							//10
				{									//101
					System.out.print("0");			//1010
				}									//10101
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}*/
		
		
		/*for(char i='A';i<='D';i++)
		{										//A
			for(char j='A';j<=i;j++)			//BB
			{									//CCC
				System.out.print(i);			//DDDD
			}
			System.out.println();
		}*/
		
		/*for(char i='A';i<='D';i++)
		{										//A
			for(char j='A';j<=i;j++)			//AB
			{									//ABC
				System.out.print(j);			//ABCD
			}
			System.out.println();
		}*/

		/*for(char i='A';i<='D';i++)
		{									//DCBA
			for(char j='D';j>=i;j--)		//DCB
			{								//DC
				System.out.print(j);		//D
			}
			System.out.println();
		}*/
	
		/*for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");				//   *
			}										//  **
			for(int j=1;j<=i;j++)					// ***
			{										//****
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");				//   *
			}										//  * *
			for(int j=1;j<=i;j++)					// * * *
			{										//* * * *
				System.out.print(" *");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{									//****
				System.out.print(" ");			// ***
			}									//  **
			for(int j=4;j>=i;j--)				//   *
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)				//  * * * *
			{									//	 * * *
				System.out.print(" ");			//    * *
			}									//     *
			for(int j=4;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}*/
		
		/*for(char i='D';i>='A';i--)
		{
			for(char j='A';j<=i;j++)			//ABCD
			{									//ABC
				System.out.print(j);			//AB
			}									//A
			System.out.println();					
		}*/					
		
		/*int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)				//1
			{									//2	3
				System.out.print(a+" ");		//4	5 6
				a++;							//7 8 9 10
			}
			System.out.println();
		}*/
		
		for(int i=4;i>=1;i--)
		{										//1234
			for(int j=1;j<=i;j++)				//123
			{									//12
				System.out.print(j);			//1
			}
			System.out.println();
		}
		
	}												
}

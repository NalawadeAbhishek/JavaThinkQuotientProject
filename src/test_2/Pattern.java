package test_2;

public class Pattern {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)					//****
			{										//***
				System.out.print("*");				//**
			}										//*
			System.out.println();
		}*/
		
		/*for(int i=5;i>=1;i--)
		{
			for(int k=5;k>=i;k--)				//12345
			{									// 1234
				System.out.print(" ");			//  123
			}									//   12
			for(int j=1;j<=i;j++)				//    1
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=4;i++)
		{
			for(int k=i;k<4;k++)
			{										//   1
				System.out.print(" ");				//  222
			}										// 33333
													//4444444
			for(int j=1;j<2*i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}

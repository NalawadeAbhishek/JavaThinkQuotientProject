package test_2;

public class Even_Odd {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			else
			{
				int square=i*i;
				System.out.print("-"+square+" ");
			}
		}

	}

}

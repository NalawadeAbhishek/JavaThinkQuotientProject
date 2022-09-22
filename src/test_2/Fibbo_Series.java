package test_2;

public class Fibbo_Series {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=20;i++)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}

	}

}

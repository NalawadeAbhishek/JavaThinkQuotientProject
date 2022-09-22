package praticeprograms;

public class Odd_Square {

	public static void main(String[] args) {
		
		
		int square=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				square=i*i;
				System.out.print(square+" ");
			}
		}
	}

}

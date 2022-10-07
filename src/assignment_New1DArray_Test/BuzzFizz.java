package assignment_New1DArray_Test;

public class BuzzFizz {

	public static void main(String[] args) {
		int num=50;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+":buzzfizz");
			}
			else if(i%5==0)
			{
				System.out.println(i+":fizz");
			}
			else if(i%3==0 )
			{
				System.out.println(i+":buzz");
			}
		}

	}

}

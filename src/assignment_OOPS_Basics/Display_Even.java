package assignment_OOPS_Basics;

public class Display_Even {

	public static void main(String[] args) {
		
		for(int i=100;i<=400;i++)
		{
			int num=i;
			boolean ans=true;
			while(num>0)
			{
				int digit=num%10;
				if(digit%2!=0)
				{
					ans=false;
					break;
				}
				num=num/10;
			}
			if(ans==true)
			{
				System.out.println(i);
			}
		}
	}
}

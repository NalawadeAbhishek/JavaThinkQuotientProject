package loop_and_switch_assignment;

public class Even_Number {

	public static void main(String[] arg) {
		//wap to print  even no. betn 121 to 229 using for loop
		
		/*for(int i=121;i<=229;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}*/
		
		//using do while loop
		int i=121;
		do
		{
			if(i%2==0)
			{
				
				System.out.print(i+" ");
				
			}
			i++;
		}while(i<=229);
		
	}

}

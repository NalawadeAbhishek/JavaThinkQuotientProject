package praticeprograms;

public class Display_Even_1To_15 {

	public static void main(String[] args) {
		
		int square=0;
		 for(int i=1;i<=15;i++)
		 {
			 //write code to display number betn 1 to 15 if no.is even then square that no.
			 //and no.is odd display as it is
			 if(i%2==0)
			 {
				 square=i*i;
				 System.out.print(square+" ");
			 }
			 else
			 {
				 System.out.println(i);
			 }
		 }
			
		
	}

}

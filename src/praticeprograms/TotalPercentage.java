package praticeprograms;

public class TotalPercentage {

	public static void main(String[] args) {
		
	int physics=75;
	int chemistry=57;
	int mathematics=91;
	int bioliogy=69;
	int computer=78;
	float outofmarks=500.0f;
	int total_subject=5;
	
	int result=physics+chemistry+mathematics+bioliogy+computer;
	System.out.println("obtain marks ="+result);
	
	int average=(result/total_subject);
	System.out.println("average ="+average);
	
	float percentage=(result/outofmarks) *100;
	System.out.println("percentage ="+percentage);
	
	}

}

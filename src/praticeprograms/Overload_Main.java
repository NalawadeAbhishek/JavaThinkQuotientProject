package praticeprograms;

public class Overload_Main {
	
	public static void main(String[] args) {
		
		Overload_Main.main(4,3);
		Overload_Main.main("Pune",2.4f);
		System.out.println("Main");
	}
	public static void main(int x,int y)
	{
		System.out.println("Multiplication is ="+(x*y));
	}
	public static void main(String a,float b)
	{
		System.out.println(a+" "+b);
	}
	
}

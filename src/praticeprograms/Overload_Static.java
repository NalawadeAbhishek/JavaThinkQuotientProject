package praticeprograms;

public class Overload_Static {

	static int x=12;
	
	public static void show()
	{
		System.out.println(x);
	}
	public static void add(int a,int b)
	{
		System.out.println("Addition is ="+(a+b));
	}
	
	public static void main(String[] args) {
		
		Overload_Static.show();
		Overload_Static.add(14,10);

	}

}

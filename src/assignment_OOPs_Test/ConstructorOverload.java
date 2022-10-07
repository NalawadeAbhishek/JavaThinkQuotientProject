package assignment_OOPs_Test;

class Employee1
{
	String ename;
	
	public Employee1()
	{
		System.out.println("Hello Employee");
	}
	public Employee1(String ename)
	{
		this.ename=ename;
	}
	public String toString()
	{
		return ename;
	}
	
}

public class ConstructorOverload {

	public static void main(String[] args) {
		Employee1 e=new Employee1();
		
		Employee1 e1=new Employee1("Amit");
		System.out.println(e1);

	}

}

package assignment_OOPs_Test;

class Animal
{
	String name="animal";
	String makeNoise()
	{
		return "generic noise";
	}
}
class Dog extends Animal
{
	String name;
	String show()
	{
		return name;//use super
	}
}

public class Demo3 {

	public static void main(String[] args) {
		Dog a=new Dog();
		System.out.println(a.show());
		
	}

}

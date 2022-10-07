package assignment_OOPs_Test;

class Creditcard
{
	public void doTransaction(Creditcard p)//
	{
		System.out.println("15% discount");
	}
}
class Debitcard extends Creditcard
{
	public void doTransaction(Debitcard q)//
	{
		System.out.println("no discount");
	}
}

public class Shopping extends Debitcard {
	
	public static void main(String[] args) {
		Shopping s=new Shopping();
		s.doTransaction(new Creditcard());
		s.doTransaction(new Debitcard());

	}

}

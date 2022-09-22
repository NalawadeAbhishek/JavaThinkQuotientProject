package praticeprograms;

class Account
{
	int ano;
	String atype;
	String aname;
	int abalance;
	
	public Account(int ano,String atype,String aname,int abalance)
	{
		this.ano=ano;
		this.atype=atype;
		this.aname=aname;
		this.abalance=abalance;
	}
	Account()
	{
		this(45456,"saving","Amit",10000);
		if(ano>0)
		{
			display();
		}
		else
		{
			System.out.println("Only +ve digits are allowed");
		}
	}
	void display()
	{
		System.out.println(ano+" "+atype+" "+aname+" "+abalance);
	}
	

}


public class This_Demo {

	public static void main(String[] args) {
		
		Account a=new Account();
		

	}

}

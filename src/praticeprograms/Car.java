package praticeprograms;

class Engine
{
	int eno;
	String etype;
	
	Engine(int eno,String etype)
	{
		this.eno=eno;
		this.etype=etype;
	}
	public String toString()
	{
		return eno+" "+etype;
	}
}

public class Car {
	
	int model_no;
	String cname;
	int price;
	Engine e;
	
	Car(int model_no,String cname,int price,Engine e)
	{
		this.model_no=model_no;
		this.cname=cname;
		this.price=price;
		this.e=e;
	}
	public String toString()
	{
		return model_no+" "+cname+" "+price+" "+e;
	}

	public static void main(String[] args) {
		
		Car c=new Car(46546,"Audi",1500000,new Engine(44,"Diseal"));

		System.out.println(c);
	}

}

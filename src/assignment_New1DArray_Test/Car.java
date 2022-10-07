package assignment_New1DArray_Test;

class SubEngine
{
	String etype;
	SubEngine(String etype)
	{
		this.etype=etype;
	}
	public String toString() 
	{
		return etype;
	}
}

class Gear
{
	String gtype;
	Gear(String gtype)
	{
		this.gtype=gtype;
	}
	public String toString()
	{
		return gtype;
	}
}

class Engine
{
	int eid;
	int date;
	String month;
	int yr;
	SubEngine e;
	Engine(int eid,int date,String month,int yr,SubEngine e)
	{
		this.eid=eid;
		this.date=date;
		this.month=month;
		this.yr=yr;
		this.e=e;
	}
	public String toString()
	{
		return eid+" "+date+" "+month+" "+yr+" "+e;
	}
	
}

public class Car {
	
	int carid;
	String carcolor;
	Engine eng;
	Gear g;
	
	Car(int carid,String carcolor,Engine eng,Gear g)
	{
		this.carid=carid;
		this.carcolor=carcolor;
		this.eng=eng;
		this.g=g;
	}
	public String toString()
	{
		return carid+" "+carcolor+" "+eng+" "+g;
	}

	public static void main(String []args)
	{
		Car c=new Car(1,"White",new Engine(4465,12,"aug",2022,new SubEngine("FlatEngine")),new Gear("auto"));
		
		System.out.println(c);
	}
	
}

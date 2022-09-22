package com.OOPs;

public class Student {
	
	int id;
	String name;
	int m1,m2,m3;
	float percentage;
	
	void acceptDetails(int i,String sname,int a,int b,int c)
	{
		id=i;
		name=sname;
		m1=a;
		m2=b;
		m3=c;
	}
	void calculatePercentage()
	{
		int total=m1+m2+m3;
		percentage=(total*100)/300;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+m1+" "+m2+" "+m3+" "+percentage+" ");
	}

	public static void main(String[] args) {
		
		Student sobj=new Student();
		sobj.acceptDetails(1,"Sachin",84,87,92);
		sobj.display();
		sobj.calculatePercentage();
		sobj.display();

	}

}

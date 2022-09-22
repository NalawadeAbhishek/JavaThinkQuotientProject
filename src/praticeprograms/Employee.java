package praticeprograms;

public class Employee
{
	int eid;
	String ename;
	int salary;
	
	public void acceptDetails(int id,String name,int s)
	{
		eid=id;
		ename=name;
		salary=s;
	}
	void display()
	{
		System.out.println(eid+" "+ename+" "+salary);
	}
	
public static void main(String[] args) {
		
		//create one emp clss emp has id,name,salary
		//asign value for id,name,salary & display it
		//for the 3 emp
		
		Employee e=new Employee();
		e.acceptDetails(1,"Amit",50000);
		e.display();
		Employee y=new Employee();
		y.acceptDetails(2,"Sumit",60000);
		y.display();
		
		Employee a=new Employee();
		a.acceptDetails(3,"rahual",70000);
		a.display();

}

	
}




	
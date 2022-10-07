package assignment_OOPs_Test;

public class Variable {

	public static void main(String[] args) {
		
		Employee2 e=new Employee2();
		e.setId(2);
		e.setName("Amit");
		//e.setManager("true");
		e.setSalary(50000.0f);
		e.setDept(new Department());
		
		e.getDept().setId(10);
		e.getDept().setDeptName("Marketing");
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept().getId()+" "+e.getDept().getDeptName());
		

	}

}

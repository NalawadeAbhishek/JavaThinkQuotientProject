package com.StringDemo;

public class Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Pune";//using literal//SCP
		String st=new String("Pune");//using new//Heap
		String s="Pune";
		
		String st2=new String("Pune");

		System.out.println(str==s);
		System.out.println(str.hashCode()+" "+s.hashCode());
		System.out.println(s==st2);
		System.out.println(s.hashCode()+" "+st2.hashCode());
		
	}

}

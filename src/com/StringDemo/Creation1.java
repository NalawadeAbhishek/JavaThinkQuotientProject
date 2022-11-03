package com.StringDemo;

public class Creation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="HelloPune";
		String st=new String("Pune");
		
		st="Hello"+st;
		System.out.println(str+" "+st);
		
		System.out.println(str.hashCode()+" "+st.hashCode());

		System.out.println(str==st);
		
		String s1="Aa";
		String s2="BB";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
			
	}

}

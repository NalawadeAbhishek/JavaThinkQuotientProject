package com.StringDemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		String str2="Hello";
		/*System.out.println(str==str2);
		
		str=str+"Pune";
		System.out.println(str==str2);*/
		
		String st2=new String("hello");
		System.out.println(str==str2);
		System.out.println(str==st2);
		
		System.out.println(str.equals(st2));
		System.out.println(str.equalsIgnoreCase(st2));
		
		String s1="HelLo";
		String s2="HeLlo";
		String s3="Hello";
		String s4="hello";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(str.compareTo(s3));
		System.out.println(s4.compareTo(st2));
		
	}

}

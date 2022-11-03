package com.StringDemo;

public class Stringmethods {

	public static void main(String[] args) {
		
		String name="Abhijeet";
		System.out.println(name);
		
		int value=name.length();//return int value
		System.out.println("Length of name ="+value);
		
		String lwrcase=name.toLowerCase();//return string value
		System.out.println(lwrcase);
		
		String uprcase=name.toUpperCase();//return string value
		System.out.println(uprcase);
		
		String nonTrimmed="    Abhijeet    ";
		System.out.println(nonTrimmed);
		System.out.println(nonTrimmed.trim());//remove both leading & trailing space
		
		System.out.println(name.substring(5));//include from 5th index
		
		System.out.println(name.substring(1,5));//(end-start)
		
		System.out.println(name.replace('t','T'));//replace old character to new character 

		System.out.println(name.replace("ee","i"));
		
		System.out.println(name.startsWith("Abhi"));//return boolean value
		
		System.out.println(name.endsWith("eet"));//return boolean value
		System.out.println(name.endsWith("t"));
		
		System.out.println(name.charAt(0));//return char this gives character present at index 0
		System.out.println(name.charAt(5));
		
		System.out.println(name.indexOf("i"));//return int value
		System.out.println(name.indexOf("eet"));
		System.out.println(name.lastIndexOf("j"));
		System.out.println(name.lastIndexOf("et",6));
		System.out.println(name.lastIndexOf("ij",3));
		
		
		 StringBuilder sb=new StringBuilder("Hello");
		 sb.append("java");
		 System.out.println("append string is ="+sb); 
		 sb.insert(1,"java");
		 System.out.println("insert ="+sb);
		
	}

}

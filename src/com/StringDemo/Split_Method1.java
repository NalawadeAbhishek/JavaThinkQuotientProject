package com.StringDemo;

public class Split_Method1 {

	public static void main(String[] args) {
		
		String s="India is my country";
		
		//String str[]=s.split("\\s");
		//String str[]=s.split("\\s",2);//string is divided into two part
		String str[]=s.split("is",5);//before is part display and after is part display
		
		for(String st:str)
		{
			System.out.println(st);
		}

	}

}

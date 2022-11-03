package com.StringDemo;

public class Split_Method2 {

	public static void main(String[] args) {
		
		//String s="India@is@my@country";
		//String str[]=s.split("@");
		
		String s="India$is$my$country";
		String str[]=s.split("\\$");
		
		for(String st:str)
		{
			System.out.println(st);
		}

	}

}

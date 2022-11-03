package com.StringDemo;

public class MutableStringDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);
		
		sb.insert(1,"#");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}

}

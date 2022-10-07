package com.array_two_d;

import java.util.Arrays;

public class ArrayDeclaration {

	int a[][];
	int [][]a1;
	int[][]a2;
	int[]a3[];
	int a4[][],x;
	int [][]a5,x1;
	int []a6[],x3;
	
	int b[],y;
	int []b1,y1;
	
	public static void show(String str,int ...a)
	{
		System.out.println(str);
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		show("Pune",10);
		show("TQ",3,5,6);
		show("Red",5,8);

	}

}

package com.StringDemo;
import java.util.*;

public class EnterCharDisplayDigit {
	
	public static void value(char ch)
	{
		String s[]= {"a+4","b+7","c+3","d+5"};
		
		if(Character.isUpperCase(ch))
		{
			ch=Character.toLowerCase(ch);
		}
		
		if(ch=='a'||ch=='b'||ch=='c'||ch=='d')
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i].charAt(0)==ch)
				{
					for(int j=0;j<s[i].length();j++)
					{
						if(s[i].charAt(j)>='0'&& s[i].charAt(j)<='9')
						{
							int x=Character.getNumericValue(s[i].charAt(j));
							System.out.println(x);
						}
					}
				}
			}
		}
		else
		{
			System.out.println("Character not present");
		}
	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter character");
	char ch=sc.next().charAt(0);
	
	EnterCharDisplayDigit.value(ch);
	
	}

}

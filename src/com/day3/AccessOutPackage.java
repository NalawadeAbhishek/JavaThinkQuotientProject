package com.day3;

import com.OOPs.AccessModifier;

public class AccessOutPackage extends AccessModifier{

	public static void main(String[] args) {
		
		AccessModifier a=new AccessModifier();
		//System.out.println(a.x);//private - can't access
		//System.out.println(a.num);//default - can't access
		//System.out.println(a.z);//protected -can't access
		System.out.println(a.s);//public
		
		AccessOutPackage p=new AccessOutPackage();
		System.out.println(p.z);
		System.out.println(p.s);
	}

}

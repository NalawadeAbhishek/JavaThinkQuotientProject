package com.InDemo;

abstract class Mobile1
{
	public abstract void ringing();
	
	public void sendSms()
	{
		System.out.println("Mobile is used for sending sms");
	}
}
class Apple1 extends Mobile1
{
	public void ringing()
	{
		System.out.println("Apple is ringing");
	}
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		Mobile1 m=new Apple1();
		m.ringing();
		m.sendSms();
	}

}

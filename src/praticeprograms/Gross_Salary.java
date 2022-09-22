package praticeprograms;

import java.util.Scanner;

public class Gross_Salary {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the basic salary of employee");
		int bs=sobj.nextInt();
		
		if(bs<=10000)
		{
			int HRA=(bs*20)/100;
			int DA=(bs*80)/100;
			int GS=bs+HRA+DA;
			System.out.println("Gross salary of employee "+GS);
		}
		else if(bs<=20000)
		{
			int HRA=(bs*25)/100;
			int DA=(bs*90)/100;
			int GS=bs+HRA+DA;
			System.out.println("Gross salary of employee "+GS);
		}
		else if(bs>20000)
		{
			int HRA=(bs*30)/100;
			int DA=(bs*95)/100;
			int GS=bs+HRA+DA;
			System.out.println("Gross salary of employee "+GS);
		}
	}
}

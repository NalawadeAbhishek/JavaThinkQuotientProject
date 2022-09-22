package praticeprograms;

import java.util.Scanner;

public class Display_1To30_Using_Continue1 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0||i%3==0||i%9==0)
			{
				continue;
			}
			else
			{
				System.out.print(i+" ");
			}
		}

	}

}

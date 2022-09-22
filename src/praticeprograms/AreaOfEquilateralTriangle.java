package praticeprograms;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter value");
		int side=sobj.nextInt();
		
		float area=(1.73f*side*side)/4;
		System.out.println("Area of equilateral triangle is " +area);

	}

}

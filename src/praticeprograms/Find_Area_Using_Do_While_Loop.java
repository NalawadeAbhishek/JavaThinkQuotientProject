package praticeprograms;

import java.util.Scanner;

public class Find_Area_Using_Do_While_Loop {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		
		char ch;
		do
		{	
			System.out.println("1.Area of circle\n2.Area of triangle\n3.Area of reactangle\n4.Area of square");
			System.out.println("enter choice of above");
			int num=sobj.nextInt();
		switch(num)
		{
		case 1:if(num==1){
					System.out.println("enter PI value");
					double PI=sobj.nextDouble();
			
					System.out.println("enter radius");
					int radius=sobj.nextInt();
			
					double area=PI*radius*radius;
					System.out.println("area of circle="+area);
		}
		break;
		case 2:if(num==2) {
					System.out.println("enter base value");
					int base=sobj.nextInt();
					System.out.println("enter height value");
					int height=sobj.nextInt();
			
					double area1=0.5*base*height;
					System.out.println("area of triangle="+area1);
		}
		break;
		case 3:if(num==3) {
					System.out.println("enter length");
					int length=sobj.nextInt();
					System.out.println("enter width value");
					int width=sobj.nextInt();
			
					double area2=length*width;
					System.out.println("area of reactangle="+area2);
		}
		break;
		case 4:if(num==4) {
					System.out.println("enter side");
					int side=sobj.nextInt();
					
					double area3=side*side;
					System.out.println("area of square="+area3);
		}
		break;
	
		}
			System.out.println("Do you want to continue....");
			ch=sobj.next().charAt(0);
		
		}while(ch=='y'||ch=='Y');
	}

}

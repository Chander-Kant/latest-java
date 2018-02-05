package inheritance;

import java.util.Scanner;

public class DemoStudent {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter id");
	int iid= sc.nextInt();
	System.out.println("Enter name=");
	String nm= sc.nextLine();
	System.out.println("Enter std=");
	String stdd= sc.nextLine();
	System.out.println("Enter m1=");
	int mm1= sc.nextInt();
	System.out.println("Enter m2=");
	int mm2= sc.nextInt();
	System.out.println("Enter m3=");
	int mm3= sc.nextInt();
	System.out.println("Enter attendance=");
	int att= sc.nextInt();
	System.out.println("Enter sports=");
	int sprt= sc.nextInt();
	
	Student3 stu= new Student3(iid,nm,stdd,mm1,mm2,mm3,att,sprt);
	stu.putdata();
	

	}

}

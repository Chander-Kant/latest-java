package project;

import java.util.Scanner;

public class Switchcase {
	int num1, num2, res, choice;
public void Accept()
{Scanner sc=new Scanner(System.in);
System.out.println("Enter value of num1");
num1= sc.nextInt();

System.out.println("Enter value of num2");
num2= sc.nextInt();

}
public void Code(){
	Accept();
	Scanner sc=new Scanner(System.in);
	System.out.println("1Add\n2.subtract\n3.multiply");
	System.out.println("enter your choice");
	choice= sc.nextInt();
	
	switch(choice) {
	case 1:
		res= num1+num2;
		System.out.println("addition result is"+res);
		break;
	case 2:
		res= num1-num2;
		System.out.println("subtraction result is"+res);
		break;
	case 3:
		res= num1*num2;
		System.out.println("multiplying result is"+res);
		break;
	
	
	}
}
	public static void main(String[] args) {
		Switchcase gg=new Switchcase();
		gg.Code();
		
		// TODO Auto-generated method stub

	}

}

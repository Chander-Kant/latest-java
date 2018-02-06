package Polymorphism;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
	MyMain mm= new MyMain();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter length");
	int lnt= sc.nextInt();
	System.out.println("Enter width");
	int wd= sc.nextInt();
	System.out.println("Enter height");
	int ht= sc.nextInt();
	System.out.println("Enter cost of 1 cube metre");
	int ct= sc.nextInt();
	Box3 bx= new Box3(lnt,wd,ht,ct);
	bx.display();
	

	}

}

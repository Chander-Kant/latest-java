package string;

import java.util.Scanner;

public class Convertermethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Convertermethod c=new Convertermethod();
		int choice=0;
		do {
			System.out.println("Welcome to Converter");
			System.out.println("Press 1 for km to m");
			System.out.println("Press 2 for l to ml");
			System.out.println("Press 3 for kg to g");
			System.out.println("Press 4 for min to sec");
			System.out.println("Press 5 for exit:");
			choice = s.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter The digit:");
				int x = s.nextInt();
				c.kmtom(x);
				break;
			}

			case 2: {
				System.out.println("Enter The digit:");
				int x = s.nextInt();
				c.ltoml(x);
				break;
			}

			case 3: {
				System.out.println("Enter The digit:");
				int x = s.nextInt();
				c.kgtog(x);
				break;
			}

			case 4: {
				System.out.println("Enter The digit:");
				int x = s.nextInt();
				c.mintosec(x);
				break;
			}

			case 5:
				break;

			default:
				System.out.println("Wrong In put");

			}
		} while (choice!=5);
		

	}
	 
	void kmtom(int x)
	{
		int km=x*1000;
		System.out.println("Km to m::"+km);
	}
	
	void ltoml(int x)
	{
		int ml=x*1000;
		System.out.println("l to ml::"+ml);
	}
	
	void kgtog(int x)
	{
		int g=x*1000;
		System.out.println("Kg to g::"+g);
	}
	
	void mintosec(int x)
	{
		int sec=x*60;
		System.out.println("Min to sec::"+sec);
	}
	

}

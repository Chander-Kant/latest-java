package Demo;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		long n= 200000;
		pin= 12346;
		System.out.println("Welcome to PNB\n khhh");
		Scanner sn= new Scanner(System.in);
		
		System.out.println("Welcome to the PNB ATM service");
		System.out.println("Press 1 for BALANCE ENQUIRY");
		System.out.println("Press 2 for WITHDRAWAL");
		System.out.println("Press 3 for DEPOSIT");
		System.out.println("Press 4 for EXIT");
		
		long opt= sn.nextInt();
		switch(opt)
		{
			case 1:
				System.out.println("Your Balance is "+bl);
			case2:
				System.out.println("Enter amount to withdraw");
				long draw= sn.nextInt();
				int rem= n - draw;
				System.out.println("Remaining amount is"+ rem);
		}

		
	}

}

package Demo;

import java.util.Scanner;

public class Atom {

	public static void main(String[] args) {
		int n;
		int pin= 12346;
		int dep;
		int bal= 10000, rem;
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to PNB");
		System.out.println("ENTER YOUR PIN");
		int entry = sc.nextInt();
		while(entry!=pin)
		{
			System.out.println("INVALID PIN \t TRY AGAIN");
			System.out.println("Enter Your pin again");
			break;
		}
		while(entry==pin)
		{
			System.out.println("PNB");
			System.out.println("Press 1 for BALANCE ENQUIRY");
			System.out.println("pRESS 2 FOR cash withdrawal");
			System.out.println("Press 3 for CASH DEPOSIT");
			System.out.println("pRESS 4 FOR exit");
		     n= sc.nextInt();
		     
		     switch(n)
		     {
		     case 1:
		    	 System.out.println("Your balance is "+bal);
		    	 break;
		     case 2:
		    	 System.out.println("Enter the amount to be withdraw");
		    	 rem= sc.nextInt();
		    	 bal= bal-rem;
		    	 System.out.println("Your remaining balance is"+bal);
		    	 break;
		     case 3:
		    	 System.out.println("Enter the amount to deposit");
		    	 dep= sc.nextInt();
		    	 bal= bal+dep;
		    	 System.out.println("Your total amount is"+bal);
		    	 break;
		    	 
		     case 4:
		    	System.exit(n);
		     
		    	 
		     }
		    
		
		}
		
		

	}

}

package evenodd;

import java.util.Scanner;

public class prog {

	public static void main(String[] args) {
		
		Scanner EO= new Scanner(System.in);
	
		System.out.println("enter number");
		int num = EO.nextInt();
		if(num%2==0)
		{
		System.out.println("number is even"); 
		}
		else 
		{
			System.out.println(" number is odd");
		}
		
			
	}

}

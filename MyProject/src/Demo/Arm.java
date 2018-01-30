package Demo;

import java.util.Scanner;
import java.lang.*;

public class Arm {
	public static void main()
	{
		int digit=0;
		double sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n= sc.nextInt();
		int temp=n;
		//count number of digit
		while(temp!=0)
		{
			temp= temp/10;
			 digit++;
		}
		while(temp!=0)
		{
			int rem= temp%10;
			  sum = sum+  power(rem, digit);
			temp= temp/10;
		}
		if(n==sum)
		{
			System.out.println(n+"is not an armstom number");
		}
		
	}

	private static int power(int rem, int digit) {
		
		return 0;
	}

}

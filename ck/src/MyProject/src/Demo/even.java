package Demo;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter any integer");
		Scanner sn= new Scanner(System.in);
		a= sn.nextInt();
		if(a%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}

	}

}

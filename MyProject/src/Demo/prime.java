package Demo;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int n ,num=1;
		System.out.println("Enter any number for factorial");
		Scanner sc= new Scanner(System.in);
		 n= sc.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
		 num=  num* i;
		
		}
System.out.println(num);
	}

}

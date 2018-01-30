package Demo;

import java.util.Scanner;

public class grt {
	public static void main(String[] args)
	{
		System.out.println("Enter three numbers");
		Scanner sc= new Scanner(System.in);
	int	a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
			int d= (a>b)?(a>c)?a:c:(b>c)?b:c;
	System.out.println(d);
		
	}
	

}

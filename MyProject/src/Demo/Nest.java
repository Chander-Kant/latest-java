package Demo;

import java.util.Scanner;

public class Nest {

	public static void main(String[] args) {
		System.out.println
		("Enter three numbers");
		Scanner sc= new Scanner(System.in);
	int	a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("GREATER is"+a);
		}
		else
		{
			System.out.println("Greater is"+c);
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("GREATER is"+b);
		}
	}
	
	if(a==b)
	{
		System.out.println(a +"and"+ b+"are equal");
	}
	if(a==c)
	{
		System.out.println(a+"&"+c+ "are equal");
	}
	if(b==c)
	{
		System.out.println(b+"&"+c+ "are equal");
	}

	}

}

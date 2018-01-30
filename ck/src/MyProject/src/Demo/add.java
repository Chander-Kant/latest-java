package Demo;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);int s1=0;
		System.out.println("Enter 10 numbers:");
		for(int i=0;i<10;i++)
		{
			int s = sn.nextInt();
			 s1= s1 + s;
			
						
		}
				
		System.out.println("Sum is" +s1);
		
	}

}

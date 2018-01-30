package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo1 {
	
	int getdata(int marks1, int marks2, int marks3)
	{
		int sum= marks1+marks2+marks3;
		return sum;
	}
	void details(String name, int rno)
	{
	  System.out.println(name);
	  System.out.println(rno);
	  
		
	}
	void average(int sum)
	{
		 float average= (sum*100)/300;
		 System.out.println("average="+average);
	}
	public static void main(String[] args) throws IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		Scanner sc= new Scanner(System.in);
		Demo1 dm= new Demo1();
		System.out.println("Enter the name n rno");
		String name= br.readLine();
		int rn=  sc.nextInt();
		System.out.println("Enter maks of 3 sub");
		
		int m1= sc.nextInt();
		int m3= sc.nextInt();
		int m2= sc.nextInt();
		
		dm.details(name , rn);
        dm.getdata(m1, m3, m2)	;
        dm.average(99);
		
		
		
		
		
		

	}

}

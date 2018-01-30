package pattern;

import java.util.Scanner;

public class Twodarray {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a[][];
		 a= new int[3][2];
		 System.out.println("Enter the   elements");
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0; j<a[i].length;j++)
			 {
				 a[i][j]= sc.nextInt();
			 }
		 }
			int temp=a[0][0];		
	for(int i=0;i<a.length;i++)
	{
		for(int j=0; j<a[i].length;j++)
		{
			if(temp<a[i][j]){}
			else{
				temp=a[i][j];
			}
		}
	}
	
	System.out.println(temp);}

}

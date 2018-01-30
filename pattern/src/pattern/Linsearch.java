package pattern;

import java.util.Scanner;

public class Linsearch {

	public static void main(String[] args) {
		int i , n, item, a[];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements to store in array=");
		n= sc.nextInt();
		a= new int[n];
		System.out.println("Enter Elements of array \n ");
		for(i=0; i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//Loop for Linear Search
		System.out.println("Enter the search value=");
		item= sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==item)
			{
				System.out.println(item +"is present at"+i+"location" );
				break;
			}
			if(item==n)
			{
				System.out.println(item+"is not exist in array");
			}
			
		}

	}

}

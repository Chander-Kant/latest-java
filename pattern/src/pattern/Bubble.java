package pattern;

import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		int i, j = 1, a[],n,item, temp=0;
		Scanner sc= new Scanner(System.in);
		a= new int[]{2,6,77,99,44,22};
		System.out.println("Enter the number of elements to store in array=");
		n= sc.nextInt();
		a= new int[n];
		System.out.println("Enter Elements of array \n ");
		for(i=0; i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//Loop for Bubble Sort
		System.out.println("Enter the search value=");
		item= sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=1;j<(n-i);j++)
			{
				if(a[j-1]>a[j]){
					//Swap
					temp= a[j-1];
					a[j-1]= a[j];
					a[j]=temp;}
				
				
			}
			
		}
		System.out.println(item+"is found at location"+a[j]);
		
	}

}

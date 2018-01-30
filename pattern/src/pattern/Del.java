package pattern;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class Del {
	public static void main(String[] args) {
		int i, j,item,x,n, flag = 1,loc=0, a[] ;
		System.out.println("Enter the no. of elements in array");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		a= new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("Enter the element to delete");
		x= sc.nextInt();
		for(i=0; i<n; i++)
		{
			if(a[i]==x)
			{
				flag=1;
				loc=n-1;
				break;
			}
			else
				flag=0;
		}
		  if(flag==1)
		  {
			  for( i=loc+1;i<n;i++)
			  {
				  a[i-1]=a[i];
			  }
			  System.out.println("After Deleting");
			  for(i=0;i<n-2;i++)
			  {
				  System.out.println(a[i]+",");
			  }
			  System.out.print(a[n-2]);
			  }
			  else
				  System.out.println("Element not found");
		
	}

}

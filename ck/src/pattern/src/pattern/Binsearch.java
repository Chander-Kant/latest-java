package pattern;

import java.util.Arrays;
import java.util.Scanner;

public class Binsearch {

	public static void main(String[] args) {
		int i , n=0, item, a[], mid, frst=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements to store in array=");
		n= sc.nextInt();
		int last=n-1;
		a= new int[n];
		System.out.println("Enter Elements of array \n ");
		for(i=0; i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		//Loop for Binary Search
		System.out.println("Enter the search value=");
		item= sc.nextInt();
		mid= (frst+last)/2;
		while(frst<=last)
		{
			
			if (a[mid]<item)
			{
				frst=mid+1;
				mid=(frst+last)/2;
				
			}
			else if(a[mid]==item){
				System.out.println(item+"is found at location"+(mid+1));
				break;
				}
			else{
				last=mid-1;
			mid=(frst+last)/2;
			}
		}
			
		
			if(frst>last)
				System.out.println(item+"is not found");
		
		
	}

}

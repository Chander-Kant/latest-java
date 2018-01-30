package pattern;

public class Selection {

	public static void main(String[] args) {
		
		int a[]= new int[]{3,77,786,97,99,899,568,554};
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j]){
					//Swap elements
					int temp= a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
		System.out.println(item+"is present in"+j);

	}

}

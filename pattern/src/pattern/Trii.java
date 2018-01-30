package pattern;

public class Trii {

	public static void main(String[] args) {
		int n, i,j,k;
		System.out.println("LEFT HANDED RIGHT TRIANGLE\n");
		for(i=0;i<10; i++)
		{
			for(j=9;j>i ;j--)
			{
				System.out.print("&");
			}
			for( k=0;k<=i;k++)
			{
				System.out.println("*");
			}
			System.out.println("");
		}

	}

}

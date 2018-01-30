package Demo;

public class fibo {
	public static void main(String[] args)
	{
		int t1=0, t2=1, n=6;
		System.out.println("Fibonacci series is:");
		System.out.println(t1);
		System.out.println(t2);
		for(int i=2;i<n;i++)
		{
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(sum);
		}
		
	}

}

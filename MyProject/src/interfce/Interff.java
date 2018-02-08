package interfce;

public interface Interff {
	int i=44;
	void show1();  //It is a kind of abstract method
	
	public default void show()
	{
		System.out.println("Hello default Interff");
	}
	public static int display(int a, int b)
	{
		return a+b;
	}	
}




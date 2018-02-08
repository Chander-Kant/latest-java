package interfce;

public interface Interff2
{
	int x=100;
	void display();
	void show1();
	
	
	public default void show()
	{
		System.out.println("Hello default Interff2");
	}
}
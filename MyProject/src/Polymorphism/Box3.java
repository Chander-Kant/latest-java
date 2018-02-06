package Polymorphism;

public class Box3 extends Box2 {
	
	int cost;
	Box3(int length,int width, int height, int cost)
	{
		super(length,width,height);
		this.cost=cost;
		
	}
	int calculate()
	{
		int cal=(super.calculate())*cost;
		System.out.println("volume="+cal);
		return cal;
	}
	void display()
	{
		System.out.println("cost is"+calculate());
	}

}

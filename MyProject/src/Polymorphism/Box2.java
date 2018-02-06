package Polymorphism;

public class Box2 extends Box1 {
int height;
	Box2(int length,int width,int height )
	{
		super(length,width);
		this.height= height;
	}
	
	int calculate()
	{
		System.out.println("Area is"+super.calculate());
		int volume= super.calculate()*height;
		return volume;
	}
}

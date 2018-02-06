package Polymorphism;

public class Box1 {
	int length, width,area;
	
	Box1(int length, int width)
	{
		this.length= length;
		this.width= width;
	}
	int calculate()
	{
		area= length*width;
		return area;
	}
   

}

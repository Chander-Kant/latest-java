package abstraction;

public abstract class Abst {

	  double x;
	  abstract void area(double x);
	  abstract void volume(double x);
	  
	 void  start(double x)
	  {
		  area(x);
		  volume(x);
		  System.out.println("Non abstract method");
	  }
	
}

package inheritance;

public class Student2 extends Student1 {
	int m1,m2,m3;
	Student2(int id,String name, String std, int m1, int m2, int m3)
	{
		super(id,name,std);
		this.m1= m1;
		this.m2=m2;
		this.m3=m3;
	}
	double calculation()
	{
		double avg= ((m1+m2+m3)/3);
		return avg;
	}
		void display1()
		{
			display();
			System.out.println("Marks of three subjects====");
			System.out.println("m1"+m1);
			System.out.println("m2"+m2);
			System.out.println("m3"+m3);
		}
	}
	


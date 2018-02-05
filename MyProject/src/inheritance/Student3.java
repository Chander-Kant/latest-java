package inheritance;

public class Student3 extends Student2 {
	int attendance;
	int sports;
	Student3(int id,String name, String std, int m1, int m2, int m3,int attendance, int sports)
	{
		super(id,name,std,m1,m2,m3);
		this.attendance= attendance;
		this.sports= sports;
	}
	double result()
	{
		double cal= calculation();
		double result= attendance+sports+cal;
		return result;
		
	}
	void putdata()
	{
		display();
		double res= result();
		System.out.println("result is"+ res);
	}
	

}

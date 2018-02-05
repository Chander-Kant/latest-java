package inheritance;

public class Student1 {
	int id;
	String name , std;
	final int x= 100;
	Student1(int id,String name, String std)
	{
		this.id=id;
		this.name= name;
		this.std= std;
		
	}
	void display()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("std"+std);
	}
}
	

	

package beans;

public class Displaydata {

	
		Displaydata(Beans b)
		{
			System.out.println("name:"+b.getEmpName());
			System.out.println("age:"+b.getEmpAge());
			System.out.println("serial no.:"+b.getSsn());
		}
}
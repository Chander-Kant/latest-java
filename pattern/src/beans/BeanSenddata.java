package beans;

public class BeanSenddata {

	public static void main(String[] args) {
	Beans b= new Beans();
	b.setSsn(222);
	b.setEmpName("Vaibhav");
	b.setEmpAge(55);
	//new object
	Beans b1= new Beans();
	b1.setSsn(223);
	b1.setEmpName("Mohit");
	b1.setEmpAge(45);
	//reference
	new Displaydata(b);
	new Displaydata(b1);
	

	}

}

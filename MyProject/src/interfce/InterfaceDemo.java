package interfce;

public class InterfaceDemo implements Interff,Interff2 {

	@Override
	public void display() {
		System.out.println("display"+x);
		int res= Interff.display(55, 55);
		
	}

	@Override
	public void show1() {
	System.out.println("Show1"+i);
	int x= Interff.display(44,66 );
	System.out.println("...................."+x);
		
	}

	@Override
	public void show() {
		
		Interff.super.show();
	}

}

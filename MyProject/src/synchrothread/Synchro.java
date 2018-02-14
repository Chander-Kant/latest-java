package synchrothread;
public class Synchro{
	int bal=1000;
	synchronized void deposit(int amt)
	{
		
		int temp = bal;
		temp = temp + amt;
		try {
			Thread.sleep(1000);
		} catch (Exception e) 
		{
	    }
		bal = temp;
		System.out.println("Accont Balance= " + bal);

	}

	public static void main(String args[]) {
		Synchro s = new Synchro();
		ThreadSynchro m = new ThreadSynchro(s);

		ThreadSynchro1 m1 = new ThreadSynchro1(s);

	}
}


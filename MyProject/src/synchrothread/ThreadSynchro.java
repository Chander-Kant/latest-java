package synchrothread;

public class ThreadSynchro extends Thread
{
	Synchro s;
	ThreadSynchro(Synchro s)
	{
		this.s=s;
		start();
	
	}
	public void run()
	{
		s.deposit(1000);
	}
}
class ThreadSynchro1 extends Thread
{
	Synchro  s;
	ThreadSynchro1(Synchro s){
	this.s=s;
	start();
	
	}
public void run()
{
	s.deposit(500);
}
}

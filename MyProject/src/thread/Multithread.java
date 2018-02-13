//ThradByRunnable

package thread;

public class Multithread implements Runnable {
	Thread t;
	String name;
	int time;
	public Multithread (String name, int time)
	{
		t= new Thread(this);
		this.name=name;
		this.time=time;
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for(int i=0; i<10; i++)
		{
			t.setPriority(1);
			System.out.println("Priority"+t.getPriority());
			System.out.println(name+"="+ i+ "Current Thread"+t.currentThread());
			
			try{
				Thread.sleep(time);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
	
		}
	}

}

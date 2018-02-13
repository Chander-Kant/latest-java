package thread;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		new Multithread("ONE", 1000);
		new Multithread("two", 5000);
	

	}

}


public class run implements Runnable {

	public static void main(String[] args) {
		run myObj = new run();
		Thread thread = new Thread(myObj);
		thread.start();
		System.out.println("This code id outside of the thread");
	}
	public void run() {
		System.out.println("This code is running in a thread");

	}

}


public class thr extends Thread {

	public static void main(String[] args) {
		thr thread = new thr();
		thread.start();
		System.out.println("This code is out of the thread");
	}
	public void run() {
		System.out.println("This code is running in a thread");

	}

}

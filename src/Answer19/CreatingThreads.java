package Answer19;

public class CreatingThreads implements Runnable{
	public void run() {
		System.out.println("Thread is running created by extending to parent thread class");
	}
	public static void main(String[] args) {
		CreatingThreads obj = new CreatingThreads();
		Thread MyThread = new Thread(obj);
		MyThread.start();
	}
	

}

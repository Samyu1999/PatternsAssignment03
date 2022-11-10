package Answer20;

public class ThreadStates implements Runnable {
	
	public static Thread thread1;
	public static ThreadStates obj;
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException  e) {
			e.printStackTrace();
			
		}
		System.out.println("State of thread1 while it joins thread2: " +ThreadStates.thread1.getState());
		
		
	}
	
	public static void main(String[] args) {
		obj = new ThreadStates();
		thread1 = new Thread(obj);
		
		System.out.println("State of thread after creating: " + thread1.getState());
		thread1.start();
		
		
	}

}


public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadB.start();
		threadA.start();
	}

}

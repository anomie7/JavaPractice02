
public class JoinExample extends Thread{
	public static void main(String[] args){
		SumThread sumThread = new SumThread();
		sumThread.start();
		
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			sumThread.join();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
		
		System.out.println("1~100 гу: " + sumThread.getSum());
	}
}

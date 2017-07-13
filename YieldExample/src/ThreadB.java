
public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;

	@Override
	public void run() {
		while (!stop) {
			Thread.State state = this.getState();
			if (work) {
				System.out.println("ThreadB의 작업 내용");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				Thread.yield();
			}
			if(state == Thread.State.TERMINATED)
				System.out.println("ThreadB의 작업 종료");
		}
	}
}


public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		super();
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: " + state);

			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			if (state == Thread.State.TERMINATED) {
				for(int i = 0; i < 10; i++){
					System.out.println("Ÿ�� ������ ����: " + state);
				}
				break;
			}

//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//			}
		}
	}
}

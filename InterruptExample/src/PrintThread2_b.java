
public class PrintThread2_b extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("���� ��");
			if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}


public class PrintThread2_a extends Thread {
	@Override
	public void run(){
		try{
			while(true){
			System.out.println("���� ��");
			Thread.sleep(1);
		}
		}catch(InterruptedException e){
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

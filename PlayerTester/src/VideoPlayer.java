
public class VideoPlayer implements Player{
	private int id;
	private static int count = 0;
	
	public VideoPlayer() {
		id = ++ count;
	}
	
	public void play() {
		System.out.println("�� ���� �������!");
	}
	
	public void stop() {
		System.out.println("�� ���� ��� ����!");
	}
	
	public void printInfo(){
		System.out.println("�� ����� ������ȣ�� [" + id + "] �Դϴ�.");
	}
	
}

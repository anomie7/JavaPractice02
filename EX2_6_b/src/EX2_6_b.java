import java.util.Scanner;

public class EX2_6_b {

	public static void main(String[] args) {
		
		System.out.println("�ﰢ���� ������ ���մϴ�.");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�غ��� ��: ");
		
		double x = stdIn.nextDouble();
		
		System.out.print("������ ��: ");
		
		double y = stdIn.nextDouble();
		
		double z = (x*y)/2;
		
		System.out.println("�ﰢ���� ������ " + z + "�Դϴ�.");
	}
}

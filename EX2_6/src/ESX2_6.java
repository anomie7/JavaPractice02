import java.util.Scanner;

public class ESX2_6 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ﰢ�� �غ��� �� : ");
		
		double x = stdIn.nextDouble();
		
		System.out.print("�ﰢ�� ������ ��: ");
		
		double y = stdIn.nextDouble();
		
		double result = x*y/2;
		
		System.out.println("�ﰢ���� ������" + result + "�Դϴ�.");
	}
}

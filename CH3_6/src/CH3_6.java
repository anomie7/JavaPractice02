import java.util.Scanner;

public class CH3_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� ������: ");
		int num = stdIn.nextInt();
		
		if(num > 0) {
			if(num%10 == 0) {
				System.out.println("�� ���� 10�� ����Դϴ�.");
			} else {
				System.out.println("�� ���� 10�� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("����� �ƴ� ���� �Է��߽��ϴ�.");
		}		
		stdIn.close();
	}
}

import java.util.Scanner;

public class CH3_5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� ������: ");
		int num = stdIn.nextInt();
		
		if(num > 0) {
			if( num%5 == 0) {
				System.out.println("�� ���� 5�� ���������ϴ�.");
			} else {
				System.out.println("�� ���� 5�� ���������� �ʽ��ϴ�.");
			}
		} else {
				System.out.println("����� �ƴ� ���� �Է��߽��ϴ�.");
		}
		
		stdIn.close();
	}

}

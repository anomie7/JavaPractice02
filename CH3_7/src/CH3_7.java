import java.util.Scanner;
public class CH3_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� ������: ");
		int num = stdIn.nextInt();
		
		if(num > 0) {
			if(num%3 == 0) {
				System.out.println("�� ���� 3���� ���������ϴ�.");
			}else if(num%3 == 1) {
				System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
			}else if(num%3 == 2) {
				System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
			}
		} else {
				System.out.println("����� �ƴ� ���� �Է��߽��ϴ�.");
		}
		stdIn.close();
	}

}

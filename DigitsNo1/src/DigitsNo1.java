import java.util.Scanner;

public class DigitsNo1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int num = stdIn.nextInt();
		
		if ( num == 0) {
			System.out.println("0�Դϴ�.");
		} else if ( num >= -9 && num <= 9) {
			System.out.println("�� �ڸ��� �Դϴ�.");
		} else {
			System.out.println("�� �ڸ��� �̻� �Դϴ�.");
		}
		
		stdIn.close();
	}

}

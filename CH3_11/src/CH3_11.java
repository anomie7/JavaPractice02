import java.util.Scanner;

public class CH3_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = stdIn.nextInt();
		
		System.out.print("���� b: ");
		int b = stdIn.nextInt();
		
		int result = a > b ? a-b : b-a;
		
		if (result <= 10) {
			System.out.println("�� ���� ���� 10 �����Դϴ�.");
		} else {
			System.out.println("�� ���� ���� 11 �̻��Դϴ�.");
		} 
		
		stdIn.close();
	}

}

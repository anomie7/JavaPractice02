import java.util.Scanner;

public class CH3_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = stdIn.nextInt();
		
		System.out.print("���� b: ");
		int b = stdIn.nextInt();
		
		int result = a > b ? a-b : b-a;
		
		System.out.println("�� ���� ���� " + result + "�Դϴ�.");
		
		stdIn.close();
	}

}

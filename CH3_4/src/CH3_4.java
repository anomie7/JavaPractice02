import java.util.Scanner;

public class CH3_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� A: ");
		int a = stdIn.nextInt();
		
		System.out.print("���� B: ");
		int b = stdIn.nextInt();
		
		if( a > b) {
			System.out.println("a�� Ů�ϴ�.");
		} else if (a < b) {
			System.out.println("b�� Ů�ϴ�.");
		} else if (a == b) {
			System.out.println("a�� b�� ���� ���Դϴ�.");
		}
		stdIn.close();
	}
}

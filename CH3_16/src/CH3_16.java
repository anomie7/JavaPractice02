import java.util.Scanner;

public class CH3_16 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		int tmp;
		if (a > b){
			tmp = a;
			a = b;
			b = tmp;
		} 
		if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if ( b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		
		System.out.println("a <= b <= c�� �ǵ��� �����߽��ϴ�.");
		System.out.println("���� a�� " + a + "�Դϴ�.");
		System.out.println("���� b�� " + b + "�Դϴ�.");
		System.out.println("���� c�� " + c + "�Դϴ�.");
		
		stdIn.close();
	}
}

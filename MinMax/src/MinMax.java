import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a : ");
		int a = stdIn.nextInt();
		
		System.out.print("����b : ");
		int b = stdIn.nextInt();
		
		int min, max;
		
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		System.out.println("�� �߿� ū ���� " + max + "�Դϴ�.");
		System.out.println("�� �߿� ���� ����" + min + "�Դϴ�.");
		
		stdIn.close();
	}

}

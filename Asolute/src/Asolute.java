import java.util.Scanner;

public class Asolute {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
	a: {
			System.out.print("���� ����: ");
			int t = stdIn.nextInt();
			if (t >= 0){
				break a;
			}
			t = -t;
			System.out.println("���밪��" + t + "�Դϴ�.");
		}
		System.out.println("A���̺� ���Դϴ�.");
	}

}

import java.util.Scanner;

public class CH3_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int num = stdIn.nextInt();
		
		if(num > 0) {
			System.out.println("���밪�� " + num + "�Դϴ�.");
		} else if(num < 0) {
			System.out.println("���밪�� " + num * -1 + "�Դϴ�.");
		}
		
		stdIn.close();
	}

}

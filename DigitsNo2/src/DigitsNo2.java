import java.util.Scanner;
public class DigitsNo2 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = stdIn.nextInt();
		
		if (n <= -10 || n >= 10) {
			System.out.println("2�ڸ��� �̻��Դϴ�.");
		} else {
			System.out.println("2�ڸ��� �̸��Դϴ�.");
		}		
	}
}

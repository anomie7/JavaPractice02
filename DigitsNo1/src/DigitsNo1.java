import java.util.Scanner;

public class DigitsNo1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값: ");
		int num = stdIn.nextInt();
		
		if ( num == 0) {
			System.out.println("0입니다.");
		} else if ( num >= -9 && num <= 9) {
			System.out.println("한 자릿수 입니다.");
		} else {
			System.out.println("두 자릿수 이상 입니다.");
		}
		
		stdIn.close();
	}

}

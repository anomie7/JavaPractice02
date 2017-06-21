import java.util.Scanner;

public class CH3_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 A: ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 B: ");
		int b = stdIn.nextInt();
		
		if( a > b) {
			System.out.println("a가 큽니다.");
		} else if (a < b) {
			System.out.println("b가 큽니다.");
		} else if (a == b) {
			System.out.println("a와 b는 같은 값입니다.");
		}
		stdIn.close();
	}
}

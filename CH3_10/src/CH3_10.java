import java.util.Scanner;

public class CH3_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 b: ");
		int b = stdIn.nextInt();
		
		int result = a > b ? a-b : b-a;
		
		System.out.println("두 수의 차는 " + result + "입니다.");
		
		stdIn.close();
	}

}

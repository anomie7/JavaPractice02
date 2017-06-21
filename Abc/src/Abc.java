import java.util.Random;
import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		a = 2;
		int b = -1;
		
		double x = 1.5 * 2;
		
		final double PI = 3.14;
		x = rand.nextDouble();
		System.out.println(
				"반지름" + x + "의 원의 면적은" +
				(PI * x * x) + "입니다.");	
		System.out.print("정수 a의 값: ");
		a = stdIn.nextInt();
		System.out.println("a / 2 = " + a / 2);
		System.out.println("a % 2 = " + a % 2);
		
		String s = "ABC";
		System.out.println("문자열 s는" + s + "입니다.");
		
		stdIn.close();
	}
	
}

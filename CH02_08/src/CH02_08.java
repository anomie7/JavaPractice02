import java.util.Scanner;
import java.util.Random;

public class CH02_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("정수값 : ");
		int num = stdIn.nextInt() - 5 + rand.nextInt(11);
		
		System.out.println("이 값의 +-5의 난수를 생성했습니다. 그것은" + num + "입니다.");
		
	}
}

import java.util.Random;
import java.util.Scanner;

public class EX2_8 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수의 값: ");
		int num1 = stdIn.nextInt(); //입력 받는 값
		
		int num2 = rand.nextInt(11); //0에서 10까지의 난수
		
		int result = num1 + (num2-5); // num2는 0에서 10까지의 난수
									  // -5를 해주면 -5에서 5까지의 난수가 발생함. 이 값을 num1에 더해주면  num1 +-5가 됨 ^.^
		
		System.out.println("이 값의 +-5의 난수를 생성했습니다. 그것은 " + result + "입니다.");
		
		stdIn.close();
	}
}

import java.util.Scanner;

public class CH3_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("양의 정수값: ");
		int num = stdIn.nextInt();
		
		if(num > 0) {
			if(num%10 == 0) {
				System.out.println("이 값은 10의 배수입니다.");
			} else {
				System.out.println("이 값은 10의 배수가 아닙니다.");
			}
		} else {
			System.out.println("양수가 아닌 값을 입력했습니다.");
		}		
		stdIn.close();
	}
}

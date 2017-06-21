import java.util.Scanner;

public class CH3_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값: ");
		int num = stdIn.nextInt();
		
		if(num > 0) {
			System.out.println("절대값은 " + num + "입니다.");
		} else if(num < 0) {
			System.out.println("절대값은 " + num * -1 + "입니다.");
		}
		
		stdIn.close();
	}

}

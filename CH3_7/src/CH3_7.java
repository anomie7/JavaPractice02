import java.util.Scanner;
public class CH3_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("양의 정수값: ");
		int num = stdIn.nextInt();
		
		if(num > 0) {
			if(num%3 == 0) {
				System.out.println("이 값은 3으로 나누어집니다.");
			}else if(num%3 == 1) {
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
			}else if(num%3 == 2) {
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
			}
		} else {
				System.out.println("양수가 아닌 값을 입력했습니다.");
		}
		stdIn.close();
	}

}

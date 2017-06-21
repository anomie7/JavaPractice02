import java.util.Scanner;

public class Minus {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값: ");
		int 강아지 = stdIn.nextInt();
		
		int 고양이 = -강아지;
		System.out.print(강아지 + "의 기호를 반전시킨 값은 " + 고양이 + "입니다.");
	}
}

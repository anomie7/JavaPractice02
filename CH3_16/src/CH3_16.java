import java.util.Scanner;

public class CH3_16 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		int tmp;
		if (a > b){
			tmp = a;
			a = b;
			b = tmp;
		} 
		if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if ( b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		
		System.out.println("a <= b <= c가 되도록 정렬했습니다.");
		System.out.println("변수 a는 " + a + "입니다.");
		System.out.println("변수 b는 " + b + "입니다.");
		System.out.println("변수 c는 " + c + "입니다.");
		
		stdIn.close();
	}
}

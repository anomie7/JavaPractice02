import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수a : ");
		int a = stdIn.nextInt();
		
		System.out.print("정수b : ");
		int b = stdIn.nextInt();
		
		int min, max;
		
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		System.out.println("둘 중에 큰 값은 " + max + "입니다.");
		System.out.println("둘 중에 작은 값은" + min + "입니다.");
		
		stdIn.close();
	}

}

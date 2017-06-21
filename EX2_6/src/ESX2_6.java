import java.util.Scanner;

public class ESX2_6 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("삼각형 밑변의 값 : ");
		
		double x = stdIn.nextDouble();
		
		System.out.print("삼각형 높이의 값: ");
		
		double y = stdIn.nextDouble();
		
		double result = x*y/2;
		
		System.out.println("삼각형의 면적은" + result + "입니다.");
	}
}

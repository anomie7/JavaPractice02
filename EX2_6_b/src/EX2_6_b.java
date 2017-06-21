import java.util.Scanner;

public class EX2_6_b {

	public static void main(String[] args) {
		
		System.out.println("삼각형의 면적을 구합니다.");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("밑변의 값: ");
		
		double x = stdIn.nextDouble();
		
		System.out.print("높이의 값: ");
		
		double y = stdIn.nextDouble();
		
		double z = (x*y)/2;
		
		System.out.println("삼각형의 면적은 " + z + "입니다.");
	}
}

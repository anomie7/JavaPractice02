import java.util.Scanner;

public class Ex05_2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("변수 x는 float형이고, 변수 y는 double형입니다.");
		
		System.out.print("x : ");
		float x = stdIn.nextFloat();
		
		System.out.print("y : ");
		double y = stdIn.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}

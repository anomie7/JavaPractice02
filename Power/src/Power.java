import java.util.Scanner;

public class Power {
	
	static double power(double x, int n){
		double fac = 1.0;
		
//		for(int i = 0; i < n; i++){
//			fac *= x;
//		}
		
		while(n-- > 0){
			fac *= x;
		}
		return fac;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a의 b승을 계산합니다.");
		
		System.out.print("실수 a : ");
		double a = stdIn.nextDouble();
		
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		
		System.out.println(a + "의 " + b + "승은 " + power(a, b) + "입니다.");
		
		stdIn.close();
	}

}

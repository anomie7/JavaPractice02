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
		
		System.out.println("a�� b���� ����մϴ�.");
		
		System.out.print("�Ǽ� a : ");
		double a = stdIn.nextDouble();
		
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		
		System.out.println(a + "�� " + b + "���� " + power(a, b) + "�Դϴ�.");
		
		stdIn.close();
	}

}

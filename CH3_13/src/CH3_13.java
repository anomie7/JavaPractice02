import java.util.Scanner;

public class CH3_13 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		
		
		int max = a;
		if(max < b) {
			max = b;	
		} if(max < c) {
			max = c;
		} 
		
		System.out.println(max);
		
		int min = a;
		if(min > b) {
			min = b;
		} if(min > c){
			min = c;
		}
		
		System.out.println(min);
		
		int med = 0;
		if(a > min && a < max) {
			med = a;
		} else if (b > min && b < max) {
			med = b;
		} else if(c > min && c < max) {
			med = c;
		}
		
		System.out.println("세 개의 정수값 " + a + ", " + b + ", " + c + " 중 가운데 값은 " + med + "입니다.");
		
		stdIn.close();
	}

}

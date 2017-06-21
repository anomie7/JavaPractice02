import java.util.Scanner;

public class CH04_09 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();
		
		int i = 1;
		int fact = 1;
		while(i <= n){
			fact *= i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 곱은 " + fact + "입니다.");
		stdIn.close();
	}

}

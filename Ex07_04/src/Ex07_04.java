import java.util.Scanner;

public class Ex07_04 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("인수 : ");
		int n = stdIn.nextInt();
		
		System.out.println("1부터 " + n + "까지의 합 : " + sum(n));
		
		stdIn.close();
		
	}

	public static int sum(int n) {
		
		int sum = 0;
		for(int i =1; i <= n; i++){
			sum+=i;
		}
		return sum;
	}

}

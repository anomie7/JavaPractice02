import java.util.Scanner;

public class CH04_08 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("양의 정수값: ");
			n = stdIn.nextInt();
		}while(n < 0);
		
		int count = 0;
		while(n > 0){
			n /= 10;
			count++;
		}
		System.out.println("이 값은 " + count + "자릿수입니다.");
		stdIn.nextInt();
	}

}

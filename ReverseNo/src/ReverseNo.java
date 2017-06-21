import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("양의 정수값을 역순으로 표현합니다.");
		
		int n1;
		do{
			System.out.print("양의 정수값: ");
			
			n1 = stdIn.nextInt();
		}while(n1 < 0);
		
		System.out.println("거꾸로 읽으면");
		while(n1 > 0){
			
			System.out.print(n1%10);
			
			n1 /= 10;
		}
		System.out.println();
		
		
	}

}

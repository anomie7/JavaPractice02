import java.util.Scanner;

public class PutAsterisk2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 개의 *을 표시합니까? : ");
		int n = stdIn.nextInt();
		
		//첫번쨰 방법
		System.out.print("1번 방법 : "	);
		int i = 0;
		while(i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
		
		//2번째 방법
		System.out.print("2번 방법 : "	);
		i = 1;
		while(i <= n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
		
		//3번 방법
//		System.out.print("3번 방법 : "	);
		
//		while(n > 0) {
//			System.out.print('*');
//			n--;
//		}
//		while(n-- > 0) {
//			System.out.print('*');
//		}
//		System.out.println();
		
		System.out.print("4번 방법 : "	);

		while(--n >= 0 ) {
			System.out.print('*');
				
		}
		System.out.println();
		stdIn.close();
	}

}

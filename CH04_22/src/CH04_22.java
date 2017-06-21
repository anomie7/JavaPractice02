import java.util.Scanner;

public class CH04_22 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 층의 피라미드를 출력합니까? : ");
		int n = stdIn.nextInt();
		
		int t = n;
		for(int i = 1; i <= n; i++){
			
			for(int j = t; j > 0; j--){
				System.out.print(" ");
			}
			for(int k =  1; k <= (i-1) * 2 + 1; k++){
				System.out.print("*");
			}
			System.out.println();
			t--;
		}
		stdIn.close();
//		for(int i = n; i > 0; i--){
//			
//			for(int j = t; j > 0; j--){
//				System.out.print(" ");
//			}
//			for(int k =  1; k <= (i-1) * 2 + 1; k++){
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
	}

}

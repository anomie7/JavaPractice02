import java.util.Scanner;

public class CH04_16 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 개의 *을 표시합니까? : ");
		int n = stdIn.nextInt();
		
//		for(int i = 0; i < n/5; i++){
//			System.out.print("*****");
//			System.out.println();
//		}
//		
//		//System.out.println();
//		
//		for(int i = 0; i < n%5; i++){
//			System.out.print("*");
//		}
		
		for(int i = 1; i <= n; i++){
			System.out.print("*");
			
			if(i%5 == 0){
				System.out.println();
			}
		}
		
		stdIn.close();
	}

}

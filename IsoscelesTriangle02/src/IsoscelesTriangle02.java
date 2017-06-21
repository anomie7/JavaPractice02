import java.util.Scanner;

public class IsoscelesTriangle02 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¸î ´Ü? : ");
		int n = stdIn.nextInt();
		
//		for(int i = 0; i < n; i++){
//			for(int j = n; j > i; j--){
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		for(int i = n; i > 0; i--){
			for(int j = i; j > 0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		stdIn.close();
	}

}

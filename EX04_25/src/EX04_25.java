import java.util.Scanner;

public class EX04_25 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¸î ´Ü? : ");
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++){
			for(int j = 1; j < n-i; j++ ){
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++  ){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < n-1; i++ ){
			for(int j = 0; j <= i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < n-1-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

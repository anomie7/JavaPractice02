import java.util.Scanner;

public class EX04_28 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			for(int k = 0; k < n*2 - i*2; k++){
				System.out.print(" ");
				
			}
			for(int l = 0; l < i; l++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-1-i; j++){
				System.out.print("*");
			}
			for(int k = 0; k < (i+1)*2; k++){
				System.out.print(" ");
			}
			for(int l = 0; l < n-1-i; l++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

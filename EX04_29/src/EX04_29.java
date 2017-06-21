import java.util.Scanner;

public class EX04_29 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < (n*2)-(i*2)-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-i-2; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < i*2+3; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

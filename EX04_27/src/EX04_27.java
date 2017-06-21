import java.util.Scanner;

public class EX04_27 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("입력 값 * 2-1번 째 줄까지 입력합니다.");
		System.out.print("몇 단? : ");
		int n =  stdIn.nextInt();
		
		for(int i = 1; i <= n*2; i++){
			if(i <= n){
				for(int j = 0; j < n-i; j++){
					System.out.print(" ");
				}
				for(int k = 0; k < (i-1) * 2 + 1; k++){
					System.out.print("*");
				}
			} else if(i > n){
				for(int j = n; j < i; j++){
					System.out.print(" ");
				}
				for(int k = 0; k <(n*2-i-1) * 2 +1; k++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}

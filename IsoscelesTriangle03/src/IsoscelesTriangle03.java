import java.util.Scanner;

public class IsoscelesTriangle03 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌상변이 직각인 삼각형을 표시합니다.");
		System.out.print("몇 단? :");
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
					System.out.print(" ");					
			}
			for(int k = 0; k < n-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

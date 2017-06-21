import java.util.Scanner;

public class IsoscelesTriangle04 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("우하단이 직각인 삼각형");
		System.out.print("몇 단? : ");
		int n = stdIn.nextInt();
		
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n-1-i; j++){  
					System.out.print(" ");			
			}
			for(int k = 0; k <= i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

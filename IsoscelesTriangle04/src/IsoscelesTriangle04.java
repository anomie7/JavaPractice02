import java.util.Scanner;

public class IsoscelesTriangle04 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���ϴ��� ������ �ﰢ��");
		System.out.print("�� ��? : ");
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

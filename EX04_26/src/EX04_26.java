import java.util.Scanner;

public class EX04_26 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� ���� �Ƕ�̵带 ����մϱ�? : ");
		int n = stdIn.nextInt();
		
		int t = n;
		for(int i = 1; i <= n; i++){
			
			for(int j = n-i; j > 0; j--){
				System.out.print(" ");
			}
			if(i%2 == 0){
				for(int k =  1; k <= (i-1) * 2 + 1; k++){
					System.out.print("*");
				}
			} else {
				for(int k =  1; k <= (i-1) * 2 + 1; k++){
					System.out.print("+");
			}
			}
			System.out.println();
			
		}
		stdIn.close();
	}

}

import java.util.Scanner;

public class PrimeNumber01 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�Ҽ��� ���� : ");
		int n = stdIn.nextInt();
		
		boolean isPrimeNumber;
		int count = 0;
		for(int i = 2; i <= n; i++){
			isPrimeNumber = true;
			
			for(int j = 2; j <= i/2; j++){
				if(i%j == 0 && isPrimeNumber){
					isPrimeNumber = false;
				} 
			}
			if(isPrimeNumber == true){
				System.out.print(i + " ");
				count++;
			} 
		}
		System.out.println();
		System.out.println("2 ~ " + n + "������ �Ҽ��� ���� : " + count);
		stdIn.close();
	}

}

import java.util.Scanner;

public class PrimeNumber02 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�Ҽ��� ���� : ");
		int n = stdIn.nextInt();
		int count_division;
		int count_prime = 0;
		
		for(int i = 1; i <= n; i++){
			count_division = 0;
			for(int j = 1; j <= i; j++){
				if(i%j == 0){
					count_division++;
				}
			}
			if(count_division == 2){
				System.out.print(i + " ");	
				count_prime++;
			}
		}
		System.out.println();
		System.out.println("2 ~ " + n + "������ �Ҽ��� ���� : " + count_prime);
	}

}

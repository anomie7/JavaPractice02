import java.util.Scanner;

public class PerfectNumber01 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�������� ���� : ");
		int n = stdIn.nextInt();
		
		int sum, count = 0;
		for(int i = 2; i <= n; i++ ){
			sum = 0;
			for(int j = 1; j < i; j++){
				if(i%j == 0){
					sum += j;
				}
			}
			if(sum == i){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("1���� " + n + "������ �������� ���� : " + count);
	}

}

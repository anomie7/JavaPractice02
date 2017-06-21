import java.util.Scanner;
//주어진 두 정수 사이의 소수 중 가장 작은 50개의 소수를 찾아서 그 합을 구하는 문제(50개 이하라면 모든 소수를 합하는 문제)
public class PrimeNumber03 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int start;
		int end;
		do{
			System.out.print("시작점 : ");
			start = stdIn.nextInt();
			
			System.out.print("끝점 : ");
			end = stdIn.nextInt();
		}while(start < 2 || end > 100000);
		
		
		boolean isPrime;
		int sum = 0;
		int count = 0;
		for(int i = start; i <= end; i++){
			isPrime = true;
			for(int j = 2; j <= i/2; j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime && count < 50){
				sum += i;
				count++;
				System.out.println(i);
			}
		}
		
		System.out.println(start + "에서" + end + "사이의 정수들 중에서 가장 작은 50개의 소수들의 합은 " + sum + "입니다.");
		stdIn.nextInt();
	}

}

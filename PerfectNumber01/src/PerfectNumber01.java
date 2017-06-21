import java.util.Scanner;

public class PerfectNumber01 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("완전수의 범위 : ");
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
		System.out.println("1에서 " + n + "까지의 완전수의 개수 : " + count);
	}

}

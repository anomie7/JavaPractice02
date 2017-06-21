import java.util.Scanner;

public class TeskSet01_03 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int odd_sum = 0, even_sum = 0;
		for(int i = 0; i < n; i++){
			if(arr[i]%2 == 0){
				even_sum += arr[i];
			} else{
				odd_sum += arr[i];
			}
		}
		System.out.println("입력받은 값에서 짝수의 합에 모든 홀수의 합을 뺀 값은" + (even_sum - odd_sum) );
	}

}

import java.util.Scanner;

public class Ex7_1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int sum;
		int max = arr[0];
		for(int i = 0; i < n; i++){
			sum = 0;
			for(int j = i; j < n; j++){
				
				sum += arr[j];
				
				if(sum > max){
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

}

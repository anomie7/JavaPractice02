import java.util.Scanner;

public class TeskSet01_7 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int result = 0;
		int min_num1 = arr[0], min_num2 = arr[1];
		int min = arr[1] > arr[0] ? arr[1] - arr[0] : arr[0] - arr[1];
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				result = arr[i] > arr[j] ? arr[i] - arr[j] : arr[j] - arr[i];
				
				if(result < min && result != 0){
					min = result;
					min_num1 = arr[i];
					min_num2 = arr[j];
				}
			}
		}
		System.out.println(min + " " + min_num1 + " " + min_num2);
	}

}

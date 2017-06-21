import java.util.Scanner;

public class Ex7_3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		int tmp = 0;
		for(int i = 1; i <= n; i++){
			arr[i-1] = stdIn.nextInt();
			
			if(arr[i-1] > arr[i] && i > 2){
				tmp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = tmp;
			}
		}
		for(int k = 0; k < n; k++){
			System.out.println(arr[k]);
		}
	}

}

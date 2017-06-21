import java.util.Scanner;

public class TeskSet01_10 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int k = stdIn.nextInt();
		
		int count = 0;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i] + arr[j] == k && arr[i] != arr[j]){
					count++;
				}
			}
		}
		System.out.println(count);
		stdIn.close();
	}

}

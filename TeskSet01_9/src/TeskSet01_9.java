import java.util.Scanner;

public class TeskSet01_9 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int tmp = 0;
		for(int i = 1; i < n; i += 2){
			for(int j = i+2; j < n; j += 2){
				if(arr[i] > arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 1; i < n; i+=2)
			System.out.println(arr[i]);
	}

}

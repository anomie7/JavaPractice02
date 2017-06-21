import java.util.Scanner;

public class Ex7_6 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		for(int i = n-1; i > 0; i--){
			for(int j = 0; j< i; j++){
				if(arr[j] < arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int k = 0; k < n; k++){
			System.out.println(arr[k]);
		}
		
	}

}

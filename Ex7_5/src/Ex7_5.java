import java.util.Scanner;

public class Ex7_5 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int tmp;
		for(int j = n-1; j > 0; j--){
			for(int k = 0; k < j; k++){
				if(arr[k] > arr[k+1]){
					tmp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = tmp;
				}
			}	
		}
		for(int i = 0; i < n; i++)
		System.out.println(arr[i]);
	}

}

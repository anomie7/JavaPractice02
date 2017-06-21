import java.util.Random;
import java.util.Scanner;

public class BubbleSort01 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("¿ä¼Ò ¼ö : ");
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = rand.nextInt(90) + 10;
		}
		
		
		for(int i = n-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
		}
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}

}

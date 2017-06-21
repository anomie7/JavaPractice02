import java.util.Random;
import java.util.Scanner;

public class Ex06_10 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = rand.nextInt(10) + 1;
		}
		
		System.out.println("정렬 전");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < n-1; i++){
			if(arr[i] == arr[i+1]){
				int tmp = arr[i+1];
				arr[i+1] = arr[i+2];
				arr[i+2] = tmp;
			} 
			if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]){
				if(arr[i+2] != arr[i+3]){
					int tmp = arr[i+1];
					arr[i+1] = arr[i+3];
					arr[i+3] = tmp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		stdIn.close();
	}

}

import java.util.Random;
import java.util.Scanner;

public class IntArrayRand {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¿ä¼Ò ¼ö : ");
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = rand.nextInt(10) + 1;

		}
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = ");
			System.out.print(arr[i] + " ");
			for(int j = 0; j < arr[i]; j++){
				System.out.print("*");
			}
			System.out.println();
			stdIn.close();
		}
	}

}

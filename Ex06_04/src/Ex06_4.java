import java.util.Random;
import java.util.Scanner;

public class Ex06_4 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("¿ä¼Ò ¼ö : ");
		int n = stdIn.nextInt();
		int fixed = 10;
		
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(10) + 1;
		}

		for (int i = fixed; i > 0; i--) {
			for (int j = 0; j < n; j++) {
				if (arr[j] < i) {
					System.out.print(" ");
				} else if (arr[j] >= i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(i % 10);
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		stdIn.close();

	}

}

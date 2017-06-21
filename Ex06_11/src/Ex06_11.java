import java.util.Random;
import java.util.Scanner;

public class Ex06_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int n;
		
		do {
			System.out.print("요소 수 : ");
			n = stdIn.nextInt();

		} while (n > 10 || n < 0);

		
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(10) + 1;
		}

		System.out.println("전");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		while (true) {
			boolean isequal = false;

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] == arr[j]) {
						isequal = true;
						break;
					}
				}

				if (isequal) {
					for (int k = 0; k < n; k++) {
						arr[k] = rand.nextInt(10) + 1;
					}
					break;
				}
			}
			
			if (!isequal) {
				break;
			}
		}

		System.out.println("후");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		stdIn.close();

	}

}

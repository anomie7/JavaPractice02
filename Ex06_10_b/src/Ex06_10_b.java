import java.util.Random;
import java.util.Scanner;

public class Ex06_10_b {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();
		
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

			for (int i = 0; i < n - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					isequal = true;
					break;
				}
			}
			if (isequal) {
				for (int k = 0; k < n; k++) {
					arr[k] = rand.nextInt(10) + 1;
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

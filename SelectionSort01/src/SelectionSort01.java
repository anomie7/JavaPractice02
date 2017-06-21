import java.util.Random;
import java.util.Scanner;

public class SelectionSort01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("��� �� : ");
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = rand.nextInt(90) + 10;
		}

		System.out.print("���� ���� �� : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// �������� ���� �κ�
		for (int i = 0; i < n-1; i++) {

			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
//			System.out.print("���� ���� " + (i + 1) + "��° : ");
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arr[j] + " ");
//			}
//			System.out.println();
			
			
			System.out.printf("%3dȸ�� �� : ", i+1);
			for(int k = 0; k < n; k++){
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		
		

		System.out.print("���� ���� �� : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

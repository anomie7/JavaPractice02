import java.util.Scanner;

public class Ex07_20 {
	static void aryIns(int[] a, int idx, int x){
		for(int i = a.length-1; i > idx; i--){
			a[i] = a[i-1];
		}
		a[idx] = x;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� ����? : ");
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		System.out.print("������ �迭�� �ε��� : ");
		int idx = stdIn.nextInt();
		
		System.out.print("������ �� : ");
		int val = stdIn.nextInt();
		
		aryIns(arr, idx, val);
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		
		stdIn.close();
		
	}

}

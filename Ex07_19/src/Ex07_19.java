import java.util.Scanner;

public class Ex07_19 {
	
	public static void aryRmv(int[] a, int r){
		for(int i = r; i < a.length-1; i++){
			a[r] = a[r+1];
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수는? : ");
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		System.out.print("삭제할 배열 요소 : ");
		int rmv = stdIn.nextInt();
		
		aryRmv(arr, rmv);
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		stdIn.close();
		
	}

}

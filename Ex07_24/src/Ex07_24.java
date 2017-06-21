import java.util.Scanner;

public class Ex07_24 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 a : ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("삭제할 값 : ");
		int rm = stdIn.nextInt();
		
		int[] b = arrayRmOf(a, rm);
		
		
		System.out.print("배열 b : ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
		
		stdIn.close();
	}

	private static int[] arrayRmOf(int[] a, int idx) {
		// TODO Auto-generated method stub
		int[] b = new int[a.length-1];
		
		for(int i = idx; i < a.length-1; i++){
			a[i] = a[i+1];
		}
		
		for(int i = 0; i < b.length; i++){
			b[i] = a[i];
		}
		
		return b;
	}

}

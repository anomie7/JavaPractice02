import java.util.Scanner;

public class Ex07_26 {
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
		
		System.out.print("삽입할 요소 : ");
		int idx = stdIn.nextInt();
		
		System.out.print("삽입할 값 : ");
		int val = stdIn.nextInt();	
		
		int[] b = arrayInsOf(a, idx, val);
		
		System.out.print("배열 b : ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
		
		stdIn.close();
	}

	public static int[] arrayInsOf(int[] a, int idx, int x) {
		// TODO Auto-generated method stub
		int[] b = new int[a.length+1];
		
		int n = b.length-1;
		for(int i = n; i > idx; i--){
			b[i] = a[i-1];
		}
		
		b[idx] = x;
		
		for(int i = 0; i < idx; i++){
			b[i] = a[i];
		}
		return b;
	}


}

import java.util.Scanner;

public class Ex07_22 {
	
	static int[] arrayClone(int[] a){
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
		return b;
	}
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = stdIn.nextInt();
		}
		
		int[] b = arrayClone(a);
		
		System.out.print("�迭 a : ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("�迭 b : ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
		stdIn.close();
	}

}

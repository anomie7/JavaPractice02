import java.util.Scanner;

public class Ex07_23 {
	static int[] arrayRmvOf(int[] a, int idx){
		int cnt = 0;

		for(int i = 0; i < a.length; i++){
			if(a[i] == idx){
				cnt++;
			}
		}
		
		int[] b = new int[cnt];
		
		cnt = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] == idx){
				b[cnt] = i;
				cnt++;
			}
		}
		
		return b;
	}
	
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
		
		System.out.print("찾을 값 : ");
		int ky = stdIn.nextInt();
		
		int[] b = arrayRmvOf(a, ky);
		
		
		System.out.print("배열 b : ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
		
		stdIn.close();

	}
}

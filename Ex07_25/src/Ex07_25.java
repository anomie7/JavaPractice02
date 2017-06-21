import java.util.Scanner;

public class Ex07_25 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("�迭 a : ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		int idx, len;
		do{
			System.out.print("������ ��� : ");
			idx = stdIn.nextInt();
			
			System.out.print("������ ���� : ");
			len = stdIn.nextInt();			
		}while(idx + len > n);
		
		int[] b = arrayRmvOfN(a, idx, len);
		
		System.out.print("�迭 b : ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
		
		stdIn.close();
	}

	public static int[] arrayRmvOfN(int[] a, int idx, int len) {
		
		int[] b = new int[a.length - len];
		int n = 0;
		
		for(int i = 0; i < idx; i++){
			b[n] = a[i];
			n++;
		}
		
		for(int i = idx + len; i < a.length; i++){
			b[n] = a[i];
			n++;
		}
		
		return b;
	}

}

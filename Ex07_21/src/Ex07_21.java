import java.util.Scanner;

public class Ex07_21 {
	static void aryExchng(int[] a, int[] b){
		int tmp =0;
		
		if(b.length > a.length ){
			for(int i = 0; i < a.length; i++){
				tmp = a[i];
				a[i] = b[i];
				b[i] = tmp;
			}
		} else {
			for(int i = 0; i < b.length; i++){
				tmp = a[i];
				a[i] = b[i];
				b[i] = tmp;
		}
	  }
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��� �� : ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++){
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("�迭 b�� ��� �� : ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++){
			b[i] = stdIn.nextInt();
		}
		
		aryExchng(a, b);
		
		System.out.println("�迭 a");
		for(int i = 0; i < na; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("�迭 b");
		for(int i = 0; i < nb; i++){
			System.out.print(b[i] + " ");
		}
		
		stdIn.close();
	}

}

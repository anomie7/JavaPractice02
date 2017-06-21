import java.util.Scanner;

public class Ex07_18 {
	
	public static void aryRmvN(int[] a, int r, int len){
		int x = a.length - len+r;
		
		if(x > len){
			for(int i = r; i < (len+r)*2; i++){
				a[i] = a[i+len];
			}			
		}else if( x <= len){
			for(int i = 0; i < x; i++){
				a[r+i] = a[i+r+len];
			}
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� ����? : ");
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int rmv, rmv_len;
		do{
			System.out.print("������ �迭 ����� ���� : ");
			rmv = stdIn.nextInt();
			
			System.out.print("������ �迭 ����� ���� : ");
			rmv_len = stdIn.nextInt();			
		}while(rmv + rmv_len > n);
		
		aryRmvN(arr, rmv, rmv_len);
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		
		stdIn.close();
		
	}

}

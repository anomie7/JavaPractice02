import java.util.Scanner;

public class Ex07_17 {
	
	public static int linearSearch(int[] x, int key){
		for(int i = x.length-1; i >= 0; i--){
			if(x[i] == key){
				return i;
			} 
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� ����? : ");
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		
		System.out.print("�˻��� ����? : ");
		int ky = stdIn.nextInt();
		
		int idx = linearSearch(arr, ky);
		
		stdIn.close();
		
		if(idx == -1){
			System.out.println("�� ���� ��Ҵ� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�� ���� arr[" + idx + "]�� �ֽ��ϴ�.");
		}
		
		
	}

}

import java.util.Random;
import java.util.Scanner;

public class Ex06_07 {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = rand.nextInt(10) + 1;
		}
		
		System.out.print("�迭 a�� ��� ����� ��\n{ ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(" }");
		
		System.out.print("�˻��� �� : ");
		int key = stdIn.nextInt();
		
		int i;
		for(i = n-1; i >= 0; i--){
			if(arr[i] == key){
				break;
			}
		}
		if( i >= 0){
			System.out.println("�̰��� a[" + i + "]�� �ֽ��ϴ�.");
		} else{
			System.out.println("�̰��� �����ϴ�.");
		}
		stdIn.close();
	}

}

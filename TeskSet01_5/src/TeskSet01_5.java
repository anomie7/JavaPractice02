import java.util.Scanner;

//n���� ������ �Է¹޾Ƽ� �� �� �ִ� ������ �ּҰ��� �� ���� ����ϴ� ���α׷�
public class TeskSet01_5 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int max = arr[0], min = arr[0];
		for(int j = 0; j < n; j++){
			if(arr[j] > max){
				max = arr[j];
			}else if(arr[j] < min){
				min = arr[j];
			}
		}
		System.out.println("�ִ밪���� �ּҰ��� �� ���� " + (max - min) );
	}

}

import java.util.Scanner;

//n개의 정수를 입력받아서 그 중 최대 값에서 최소값을 뺀 값을 출력하는 프로그램
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
		System.out.println("최대값에서 최소값을 뺀 값은 " + (max - min) );
	}

}

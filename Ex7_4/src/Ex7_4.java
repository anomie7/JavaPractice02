import java.util.Scanner;

public class Ex7_4 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			int tmp = stdIn.nextInt();
			int j = i -1;
			
			while(j >= 0 && arr[j] > tmp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = tmp;
			
			for(int k =0;k <= i; k++){
				System.out.println(arr[k] + " ");
			    System.out.println();
			}
		}
		stdIn.close();
	}

}

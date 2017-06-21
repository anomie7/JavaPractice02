import java.util.Scanner;

public class Ex7_2 {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		int val;
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length; j++){
				val = 0;
				boolean isPrime = true;
				for(int k = i; k <= j; k++){
					val = val*10 + arr[k];
				}
				for(int k = 2; k*k <= val; k++)
					if (val%k == 0 && isPrime){
						isPrime = false;
				}
				if(isPrime && val > max){
					max = val;
				}
				
			}
		}
		System.out.println(max);
	}

}

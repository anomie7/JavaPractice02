import java.util.Scanner;

public class Ex07_28 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		int x = 0;
		
		while(true){
			
			if(x == n){
				break;
			}
			
			int tmp = stdIn.nextInt();
			if( x == 0){
				arr[x] = tmp;
			} else if(arr[x-1] > tmp){
				for(int j = x; j > 0; j--){
					if(arr[j-1] > tmp){
						arr[j] = arr[j-1];
						arr[j-1] = tmp;					
					}
				}
			} else{
				arr[x] = tmp;				
			}
			
			x++;
			
			for(int i = 0; i < x; i++)
				System.out.print(arr[i] + " ");
		}
		stdIn.close();
	}

}

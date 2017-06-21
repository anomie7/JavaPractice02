import java.util.Scanner;

public class MagicSquare01 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		int [][] a = new int[n][n];
		int i =0, j=2;
		
		//마방진 구현 부분
		for(int k =1; k<=n*n; k++){
			a[i][j] = k;
			
			if(k%n == 0){
				i++;
				if(i == n){
					i = 0;
				}
			} else {
				i--;
				if(i == -1){
					i = n-1;
				}
				j++;
				if(j == n) {
					j = 0;
				}
			}
		}
		
		//마방진 출력 부분
		for(i = 0; i < n; i++){
			for(j =0; j<n; j++){
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		
	}

}

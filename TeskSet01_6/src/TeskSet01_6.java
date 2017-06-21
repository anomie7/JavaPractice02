import java.util.Scanner;

public class TeskSet01_6 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		for(int i = 2; i <= n*n; i *= 2){
				if(n <= i){
					System.out.println(i);
					break;
				}
		}
	}

}

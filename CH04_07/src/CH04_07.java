import java.util.Scanner;

public class CH04_07 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 개를 표시합니까? : ");
		int n = stdIn.nextInt();
		
		int i = 1;
		while(i <= n){
			if(i%2 != 0){
				System.out.print("*");
			} else{
				System.out.print("+");
			}
			
			i++;
		}
		stdIn.close();
	}

}

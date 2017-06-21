import java.util.Scanner;

public class CH04_14 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("nÀÇ °ª: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++){
			System.out.print(i);
			
			if(i < n){
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
			sum += i;
		}
		System.out.println(sum);
	}

}

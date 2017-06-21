import java.util.Scanner;

public class Fibonachi {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("피보나치 수열의 개수 : ");
		int n = stdIn.nextInt();
		
		int n1 =1, n2 = 1, n3 = 0;
		System.out.print(n1 + " ");
		System.out.print(n2 + " ");
		
		for(int i = 2; i < n; i++){
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
		stdIn.close();
	}

}

import java.util.Scanner;

public class Ex07_01 {
	
	static int signOf(int n){
		if(n == 0){
			return 0;
		}
		
		return n > 0 ? 1: -1;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("ÀÎ¼ö : ");
		int n = stdIn.nextInt();
		
		System.out.println(signOf(n));
		
		stdIn.close();
	}

}

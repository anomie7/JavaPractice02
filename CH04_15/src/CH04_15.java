import java.util.Scanner;

public class CH04_15 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 cm부터 : ");
		int n1 = stdIn.nextInt();
		
		System.out.print("몇 cm까지 : ");
		int n2 = stdIn.nextInt();
		
		System.out.print("몇 cm마다 : ");
		int n3 = stdIn.nextInt();
		
		for(int i = n1; n1 <= n2; n1 += n3){
			
			double avg = (n1 - 100) * 0.9;
			
			System.out.println("신장" + "  표준 체중");
			System.out.println(n1 + "   " + avg );
			
		}
		stdIn.close();
	}

}

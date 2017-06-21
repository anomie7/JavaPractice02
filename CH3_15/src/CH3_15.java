import java.util.Scanner;

public class CH3_15 {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("정수 a: ");
	int a = stdIn.nextInt();
	
	System.out.print("정수 b: ");
	int b = stdIn.nextInt();
	
	if( a < b) {
		int tmp;
		
		tmp = a;
		a = b;
		b = tmp;
	}
	
	System.out.println("a>=b가 되도록 정렬했습니다.");
	System.out.println("변수 a는 " + a + "입니다.");
	System.out.println("변수 b는 " + b + "입니다.");
	
	stdIn.close();
	}

}

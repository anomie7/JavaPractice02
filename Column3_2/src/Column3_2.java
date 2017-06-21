import java.util.Scanner;

public class Column3_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 2 : ");
		int b = stdIn.nextInt();
		
		if( a == 1){
			if(b == 1){
			   System.out.println("a도 1이고 b도 1입니다.");
			}
		}else {
			System.out.println("a는 1이 아닙니다.");
		}
		
		if( a == 1){
			if(b == 1) {
				System.out.println("a도 1이고 b도 1입니다.");
			} else {
			System.out.println("a는 1이고 b는 1이 아닙니다.");
			}
		}
		stdIn.close();
	}
}

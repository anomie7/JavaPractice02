import java.util.Scanner;

public class Column3_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int a = stdIn.nextInt();
		
		System.out.print("���� 2 : ");
		int b = stdIn.nextInt();
		
		if( a == 1){
			if(b == 1){
			   System.out.println("a�� 1�̰� b�� 1�Դϴ�.");
			}
		}else {
			System.out.println("a�� 1�� �ƴմϴ�.");
		}
		
		if( a == 1){
			if(b == 1) {
				System.out.println("a�� 1�̰� b�� 1�Դϴ�.");
			} else {
			System.out.println("a�� 1�̰� b�� 1�� �ƴմϴ�.");
			}
		}
		stdIn.close();
	}
}

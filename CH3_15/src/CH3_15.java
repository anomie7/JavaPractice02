import java.util.Scanner;

public class CH3_15 {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("���� a: ");
	int a = stdIn.nextInt();
	
	System.out.print("���� b: ");
	int b = stdIn.nextInt();
	
	if( a < b) {
		int tmp;
		
		tmp = a;
		a = b;
		b = tmp;
	}
	
	System.out.println("a>=b�� �ǵ��� �����߽��ϴ�.");
	System.out.println("���� a�� " + a + "�Դϴ�.");
	System.out.println("���� b�� " + b + "�Դϴ�.");
	
	stdIn.close();
	}

}

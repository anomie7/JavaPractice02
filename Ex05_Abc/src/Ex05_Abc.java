import java.util.Scanner;

public class Ex05_Abc {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("15	/2	= " + 15	/2	);
		System.out.println("15.0	/2.0	= " + 15.0	/2.0	);
		System.out.println("15.0	/2	= " + 15.0	/2	);
		System.out.println("15	/2.0	= " + 15	/2.0	);
		
		System.out.print("���� x : "); int x = stdIn.nextInt();
		System.out.print("���� y : "); int y = stdIn.nextInt();
		
		boolean eq = ( x == y );
		System.out.println("�̰��� ��" +
							(eq ? "���ϴ�." : "�� �ʽ��ϴ�."));
		
		System.out.println("��հ���" +
							(double)(x + y) / 2 + "�Դϴ�.");
		
		for(int i= 0; i <= 1000; i++)
			System.out.printf("x = %6.5f\n", (float)i / 1000);
		
		System.out.println("\"ABC\"�� ���ڿ� ���ͷ�.");
		
		for(int i = 0; i <= 3; i++){
			for(int j = 0; j <=i; j++){
				System.out.print('\\');
			}
			System.out.println();
		}
		
	}

}

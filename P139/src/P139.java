import java.util.Scanner;

public class P139 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("1 - ���� ����");
			System.out.println("2 - ���� �ݱ�");
			System.out.println("3 - ���� ����");
			System.out.println("4 - ���� ����");
			
			System.out.println("�޴� ����(1~4) : ");
			n = stdIn.nextInt();
			
			System.out.println( );
		}while(n > 4 || n < 1);
		
		switch(n) {
		case 1:
			System.out.println("������ �������ϴ�.");
			break;
		case 2:
			System.out.println("������ �ݾҽ��ϴ�.");
			break;
		case 3:
			System.out.println("������ �����߽��ϴ�.");
			break;
		case 4:
			System.out.println("���Ͽ� ���⸦ �Ͽ����ϴ�.");
			break;
		}
		stdIn.close();
	}

}

import java.util.Random;
import java.util.Scanner;

public class CH3_17 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("������ ���ðڽ��ϱ�? ");
		int my_hand = stdIn.nextInt();
		
		switch(my_hand) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		}
		
		int com_hand = rand.nextInt(3);
		
		switch(com_hand) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		}
		
		if (com_hand == my_hand){
			System.out.println("�����ϴ�.");
		} else if (com_hand == 0 && my_hand == 1){
			System.out.println("����� �̰���ϴ�.");
		} else if (com_hand == 1 && my_hand == 2){
			System.out.println("����� �̰���ϴ�.");
		} else if (com_hand == 2 && my_hand == 0){
			System.out.println("����� �̰���ϴ�.");
		} else if ( my_hand > 2 || my_hand < 0){
			System.out.println("�ٽ� �Է����ּ���.");
		} else {
			System.out.println("����� �����ϴ�.");
		}
	
		stdIn.close();
	}
}

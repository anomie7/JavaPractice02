import java.util.Random;
import java.util.Scanner;

public class FingerFlasching {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		String[] hands = { "����", "����", "��"};
		int retry;
		
		do{
			int comp = rand.nextInt(3);
			
			int user;
			do {
				System.out.print("����������");
				for(int i = 0; i < 3; i++){
					System.out.printf("(%d)%s", i, hands[i]);
				}
				System.out.print(" : ");
				user = stdIn.nextInt();
			}while(user < 0 || user > 2);
			
			System.out.println("���� " + hands[comp] + "�̰�, �����" + hands[user] + "�Դϴ�.");
			
			int judge = (user - comp +3) % 3;
			switch(judge){
			case 0:
				System.out.println("�����ϴ�.");
				break;
			case 1:
				System.out.println("����� �̰���ϴ�.");
				break;
			case 2:
				System.out.println("����� �����ϴ�.");
				break;
			}
			do{
				System.out.print("�ѹ� ��? (0) �ƴϿ� (1)�� : ");
				retry = stdIn.nextInt();
			}while(retry != 0 && retry != 1);
			
		}while(retry == 1);
		System.out.println("���� ����");
		stdIn.close();
	}

}

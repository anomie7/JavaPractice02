import java.util.Scanner;

public class CH3_18 {
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("�� ���ΰ���? ");
	int season = stdIn.nextInt();
	
	switch(season){
	case 12:
	case 1:
	case 2:
		System.out.println("�ܿ��Դϴ�.");
		break;
	case 3:
	case 4:
	case 5:
		System.out.println("���Դϴ�.");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("�����Դϴ�.");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println("�����Դϴ�.");
		break;
	default:
		System.out.println("�߸� �Է��ϼ̽��ϴ�.\n�ٽ� �Է����ּ���.");
		break;
		}
	
	stdIn.close();
	}
}

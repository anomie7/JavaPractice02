import java.util.Scanner;

public class CH3_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = stdIn.nextInt();
		
		if(score >= 80 && score <=100) {
			System.out.println("���");
		} else if(score >= 70 && score <= 79) {
			System.out.println("��ȣ");
		} else if(score >= 60 && score <= 69) {
			System.out.println("����");
		} else if (score >= 0 && score <= 59) {
			System.out.println("����");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. ������ 0~100���� ������ �Է����ּ���.");
		}
		
		stdIn.nextInt();
	}

}

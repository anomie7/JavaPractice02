import java.util.Random;
import java.util.Scanner;

public class EX2_8 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ ��: ");
		int num1 = stdIn.nextInt(); //�Է� �޴� ��
		
		int num2 = rand.nextInt(11); //0���� 10������ ����
		
		int result = num1 + (num2-5); // num2�� 0���� 10������ ����
									  // -5�� ���ָ� -5���� 5������ ������ �߻���. �� ���� num1�� �����ָ�  num1 +-5�� �� ^.^
		
		System.out.println("�� ���� +-5�� ������ �����߽��ϴ�. �װ��� " + result + "�Դϴ�.");
		
		stdIn.close();
	}
}

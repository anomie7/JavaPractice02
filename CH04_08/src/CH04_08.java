import java.util.Scanner;

public class CH04_08 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���� ������: ");
			n = stdIn.nextInt();
		}while(n < 0);
		
		int count = 0;
		while(n > 0){
			n /= 10;
			count++;
		}
		System.out.println("�� ���� " + count + "�ڸ����Դϴ�.");
		stdIn.nextInt();
	}

}

import java.util.Scanner;
//�־��� �� ���� ������ �Ҽ� �� ���� ���� 50���� �Ҽ��� ã�Ƽ� �� ���� ���ϴ� ����(50�� ���϶�� ��� �Ҽ��� ���ϴ� ����)
public class PrimeNumber03 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int start;
		int end;
		do{
			System.out.print("������ : ");
			start = stdIn.nextInt();
			
			System.out.print("���� : ");
			end = stdIn.nextInt();
		}while(start < 2 || end > 100000);
		
		
		boolean isPrime;
		int sum = 0;
		int count = 0;
		for(int i = start; i <= end; i++){
			isPrime = true;
			for(int j = 2; j <= i/2; j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime && count < 50){
				sum += i;
				count++;
				System.out.println(i);
			}
		}
		
		System.out.println(start + "����" + end + "������ ������ �߿��� ���� ���� 50���� �Ҽ����� ���� " + sum + "�Դϴ�.");
		stdIn.nextInt();
	}

}

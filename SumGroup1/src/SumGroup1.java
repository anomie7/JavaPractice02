import java.util.Scanner;

public class SumGroup1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ ������ ����մϴ�.");
		int total = 0;
		
		outer:
			for(int i = 1; i <= 10; i++){
				System.out.println("�� �� " + i + "�׷�");
				int sum = 0;
				inner:
					for(int j = 0; j < 5; j++){
						System.out.print("���� : ");
						int t = stdIn.nextInt();
						if(t == 99999){
							break outer;
						} else if(t == 88888){
							break inner;
						}
						sum += t;
					}
				System.out.println("�Ұ��" + sum + "�Դϴ�. \n");
				total += sum;
			}
			System.out.println("\n�հ��" + total + "�Դϴ�.");
			stdIn.close();
	}

}

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� �������� �������� ǥ���մϴ�.");
		
		int n1;
		do{
			System.out.print("���� ������: ");
			
			n1 = stdIn.nextInt();
		}while(n1 < 0);
		
		System.out.println("�Ųٷ� ������");
		while(n1 > 0){
			
			System.out.print(n1%10);
			
			n1 /= 10;
		}
		System.out.println();
		
		
	}

}

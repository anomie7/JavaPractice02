import java.util.Scanner;

public class CH04_15 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� cm���� : ");
		int n1 = stdIn.nextInt();
		
		System.out.print("�� cm���� : ");
		int n2 = stdIn.nextInt();
		
		System.out.print("�� cm���� : ");
		int n3 = stdIn.nextInt();
		
		for(int i = n1; n1 <= n2; n1 += n3){
			
			double avg = (n1 - 100) * 0.9;
			
			System.out.println("����" + "  ǥ�� ü��");
			System.out.println(n1 + "   " + avg );
			
		}
		stdIn.close();
	}

}

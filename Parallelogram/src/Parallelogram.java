import java.util.Scanner;

public class Parallelogram {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�غ��� ���� : ");
		int w = stdIn.nextInt();
		
		System.out.print("���� �뺯�� ����: ");
		int h = stdIn.nextInt();
		
		
		for(int i =1; i <= h; i++){
			for(int j = h-i; j > 0; j--){
				System.out.print(" ");
			}
			for(int k = 0; k < w; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		stdIn.close();
	}

}

import java.util.Random;
import java.util.Scanner;

public class CH4_2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int randNum = rand.nextInt(90) + 10;
		
		System.out.println("���� ��ġ�� ������ �����ϰڽ��ϴ�.");
		System.out.println("10�� 99������ ���ڸ� �Է����ּ���");
		
		int myNum;
		
		do{		
			myNum = stdIn.nextInt();
			
			if(myNum < 10 || myNum > 99){
				System.out.println("10�� 99������ ���ڸ� �Է����ּ���");
			}else if(myNum > randNum){
				System.out.println("�� ���� ���� �Է����ּ���.");
			} else if(myNum < randNum){
				System.out.println("�� ū ���� �Է����ּ���.");
			} 
		}while(myNum != randNum);
		
		System.out.println("�����Դϴ�.");
		
		stdIn.close();
		
	}

}

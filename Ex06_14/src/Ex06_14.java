import java.util.Random;
import java.util.Scanner;

public class Ex06_14 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		String[] s1 = {
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		};
		
		System.out.println("���� ����ܾ�� �Է��� �ֽʽÿ�.");
		System.out.println("���� ó�� ���ڴ� �빮�ڷ�, 2��° ���� ���Ĵ� �ҹ��ڷ� �մϴ�.");
		
		int retry;
		int remember = 0;
		
		do{
		
			int month = rand.nextInt(12);
			
			if(month == remember && month < 12 && month > 5){
				month -= rand.nextInt(6)+1;
			} else if(month == remember && month >= 0 && month < 6){
				month += rand.nextInt(6)+1;
			}
			
			System.out.print(month+1 + "�� : ");
			String s2 = stdIn.next();
			
			if(s1[month].equals(s2)){
				System.out.print("�����Դϴ�. �ٽ� �ѹ� �Ͻðڽ��ϱ�? 1---Yes / 0 --- No :");
			} else {
				System.out.println("�ƴմϴ�.");
			}
			
			retry = stdIn.nextInt();
			remember = month;
		}while(retry == 1);
		
		stdIn.close();
	}

}

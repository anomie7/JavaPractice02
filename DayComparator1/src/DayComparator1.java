import java.util.Scanner;

public class DayComparator1 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int y, m, d;
		System.out.println("��¥ 1�� �Է��Ͻÿ�.");
		System.out.print("�� : ");
		y = stdIn.nextInt();
		System.out.print("�� : ");
		m = stdIn.nextInt();
		System.out.print("�� : ");
		d = stdIn.nextInt();
		Day day1 = new Day(y, m, d);
		
		System.out.println("��¥ 2�� �Է��Ͻÿ�.");
		System.out.print("�� : ");
		y = stdIn.nextInt();
		System.out.print("�� : ");
		m = stdIn.nextInt();
		System.out.print("�� : ");
		d = stdIn.nextInt();
		Day day2 = new Day(y, m, d);
		
		
		if(day1 == day2){
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		stdIn.close();
	}

}

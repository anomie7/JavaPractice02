import java.util.Scanner;

public class Ex07_06 {
	static void printSeason(int m){
	
		switch(m){
		case 3:
		case 4:
		case 5:
			System.out.print("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("����");
			break;
		case 12:
		case 1:
		case 2: 
			System.out.print("�ܿ�");
			break;
		default:
			System.out.println(" ");	
		}
	}
	
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���. : ");
		int m = stdIn.nextInt();
		
		printSeason(m);
		
		stdIn.close();
	}

}

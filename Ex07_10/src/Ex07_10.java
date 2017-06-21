import java.util.Random;
import java.util.Scanner;

public class Ex07_10 {
	
	public static boolean confirmRetry() {
		int cnt;
		do{
			System.out.print("�ٽ� �ѹ�? <Yes-1/No-0> : ");
			cnt = stdIn.nextInt();
		}while (cnt != 0 && cnt != 1);
		
		return cnt==1;
	}
	
	public static void arithmetic(int x, int y, int z, int n){
			int k;
			switch(n){
			
			case 0:
				System.out.print(x + " + " + y + " + " + z + " = ");
				k = stdIn.nextInt();
				
				if(k == x + y + z){
					System.out.println("�����Դϴ�. ¦¦¦");
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�!!");
				break;
			case 1:
				System.out.print(x + " + " + y + " - " + z + " = ");
				k = stdIn.nextInt();
				
				if(k == x + y - z){
					System.out.println("�����Դϴ�. ¦¦¦");
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�!!");
				break;
			case 2:
				System.out.print(x + " - " + y + " + " + z + " = ");
				k = stdIn.nextInt();
				
				if(k == x - y + z){
					System.out.println("�����Դϴ�. ¦¦¦");
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�!!");
				break;
			case 3:
				System.out.print(x + " - " + y + " - " + z + " = ");
				k = stdIn.nextInt();
				
				if(k == x - y - z){
					System.out.println("�����Դϴ�. ¦¦¦");
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�!!");
				break;
			}
			
		
	}
	
	
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args){
		Random rand = new Random();
		
		System.out.println("�ϻ� Ʈ���̴�!!");
		
		do{
			int n = rand.nextInt(4);
			
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			arithmetic(x, y, z, n);
			
		}while (confirmRetry());
		System.out.println("������ ����Ǿ����ϴ�.");
	}


}

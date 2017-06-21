import java.util.Random;
import java.util.Scanner;

public class CH3_17 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("무엇을 내시겠습니까? ");
		int my_hand = stdIn.nextInt();
		
		switch(my_hand) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
		
		int com_hand = rand.nextInt(3);
		
		switch(com_hand) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
		
		if (com_hand == my_hand){
			System.out.println("비겼습니다.");
		} else if (com_hand == 0 && my_hand == 1){
			System.out.println("당신이 이겼습니다.");
		} else if (com_hand == 1 && my_hand == 2){
			System.out.println("당신이 이겼습니다.");
		} else if (com_hand == 2 && my_hand == 0){
			System.out.println("당신이 이겼습니다.");
		} else if ( my_hand > 2 || my_hand < 0){
			System.out.println("다시 입력해주세요.");
		} else {
			System.out.println("당신이 졌습니다.");
		}
	
		stdIn.close();
	}
}

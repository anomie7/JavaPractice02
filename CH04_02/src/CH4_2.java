import java.util.Random;
import java.util.Scanner;

public class CH4_2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int randNum = rand.nextInt(90) + 10;
		
		System.out.println("숫자 맞치기 게임을 시작하겠습니다.");
		System.out.println("10과 99사이의 숫자를 입력해주세요");
		
		int myNum;
		
		do{		
			myNum = stdIn.nextInt();
			
			if(myNum < 10 || myNum > 99){
				System.out.println("10과 99사이의 숫자를 입력해주세요");
			}else if(myNum > randNum){
				System.out.println("더 작은 수를 입력해주세요.");
			} else if(myNum < randNum){
				System.out.println("더 큰 수를 입력해주세요.");
			} 
		}while(myNum != randNum);
		
		System.out.println("정답입니다.");
		
		stdIn.close();
		
	}

}

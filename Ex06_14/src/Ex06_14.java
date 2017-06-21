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
		
		System.out.println("월을 영어단어로 입력해 주십시오.");
		System.out.println("또한 처음 문자는 대문자로, 2번째 문자 이후는 소문자로 합니다.");
		
		int retry;
		int remember = 0;
		
		do{
		
			int month = rand.nextInt(12);
			
			if(month == remember && month < 12 && month > 5){
				month -= rand.nextInt(6)+1;
			} else if(month == remember && month >= 0 && month < 6){
				month += rand.nextInt(6)+1;
			}
			
			System.out.print(month+1 + "월 : ");
			String s2 = stdIn.next();
			
			if(s1[month].equals(s2)){
				System.out.print("정답입니다. 다시 한번 하시겠습니까? 1---Yes / 0 --- No :");
			} else {
				System.out.println("아닙니다.");
			}
			
			retry = stdIn.nextInt();
			remember = month;
		}while(retry == 1);
		
		stdIn.close();
	}

}

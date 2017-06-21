import java.util.Random;
import java.util.Scanner;

public class Ex06_15 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		String[] s1 = {
				"sunday","monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
		};
		
		String[] s2 = {
				"일", "월", "화", "수", "목", "금", "토"
		};
		
		System.out.println("요일을 영어의 소문자로 입력하십시오.");
		
		int retry;
		int remember = 0;
		
		do{
		
			int day = rand.nextInt(7);
			
			if(day == remember && day < 8 && day > 3){
				day -= rand.nextInt(4)+1;
			} else if(day == remember && day >= 0 && day < 3){
				day += rand.nextInt(2)+1;
			}
			
			System.out.print(s2[day] + "요일 : ");
			String s3 = stdIn.next();
			
			if(s1[day].equals(s3)){
				System.out.print("정답입니다. 다시 한번 하시겠습니까? 1---Yes / 0 --- No :");
			} else {
				System.out.println("아닙니다.");
			}
			
			retry = stdIn.nextInt();
			remember = day;
		}while(retry == 1);
		
		stdIn.close();
		
	}

}

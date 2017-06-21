import java.util.Scanner;

public class CH3_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = stdIn.nextInt();
		
		if(score >= 80 && score <=100) {
			System.out.println("우수");
		} else if(score >= 70 && score <= 79) {
			System.out.println("양호");
		} else if(score >= 60 && score <= 69) {
			System.out.println("보통");
		} else if (score >= 0 && score <= 59) {
			System.out.println("낙제");
		} else {
			System.out.println("잘못입력하셨습니다. 점수는 0~100까지 범위로 입력해주세요.");
		}
		
		stdIn.nextInt();
	}

}

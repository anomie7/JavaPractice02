import java.util.Scanner;

public class DayComparator2 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int y, m, d;
		System.out.println("날짜 1을 입력하시오.");
		System.out.print("년 : ");
		y = stdIn.nextInt();
		System.out.print("월 : ");
		m = stdIn.nextInt();
		System.out.print("일 : ");
		d = stdIn.nextInt();
		Day day1 = new Day(y, m, d);
		
		System.out.println("날짜 2을 입력하시오.");
		System.out.print("년 : ");
		y = stdIn.nextInt();
		System.out.print("월 : ");
		m = stdIn.nextInt();
		System.out.print("일 : ");
		d = stdIn.nextInt();
		Day day2 = new Day(y, m, d);
		
		
		if(day1.getYear() == day2.getYear() && 
				day1.getMonth() == day2.getMonth() && 
				day1.getDate() == day2.getDate() ){
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		stdIn.close();
	}

}

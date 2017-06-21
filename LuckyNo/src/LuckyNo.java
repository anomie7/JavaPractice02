import java.util.Random;

public class LuckyNo {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int lucky = rand.nextInt(10);
		
		System.out.println("오늘의 행운의 숫자는" + lucky * 100 + "입니다.");
	}
}

import java.util.Random;

public class EX2_9 {
 
	public static void main(String[] args) {
		Random rand = new Random();
		
		double num = rand.nextDouble();
		
		final double result1 = num * 10;
		final double result2 = num*2 - 1;
		
		System.out.println("0.0 이상 1.0 미만의 실수 : " + num);
		System.out.println("0.0이상 10.0 미만의 실수 : " + result1);
		System.out.println("-1.0 이상 1.0 미만의 실수: " + result2 );
		
	}
}

import java.util.Random;

public class LuckyNo02 {

	public static void mian(String[] args) {
		Random rand = new Random();
		
		boolean lucky1 = rand.nextBoolean();
		
		double lucky2 = rand.nextDouble();
		
		System.out.println("행운의 수 1: " + lucky1);
		System.out.println("행운의 수 2: " + lucky2);
		
	}
}

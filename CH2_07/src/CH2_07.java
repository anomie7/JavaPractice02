import java.util.Random;

public class CH2_07 {
	
public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num1 = rand.nextInt(9);
		int num2 = rand.nextInt(9);
		int num3 = rand.nextInt(90);
		
		System.out.println(num1 + 1);
		System.out.println(num2 - 9);
		System.out.println(num3 + 10);
	}
}

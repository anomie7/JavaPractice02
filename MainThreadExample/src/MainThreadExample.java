
public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setMemory(100);
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
//		calculator.setMemory(100);
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}

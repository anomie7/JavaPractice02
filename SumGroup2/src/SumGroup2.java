import java.util.Scanner;

public class SumGroup2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수의 덧셈을 계산합니다.");
		int total = 0;
		
		outer:
			for(int i = 1; i <= 10; i++){
				System.out.println("■제" + i + "그룹");
				
				for(int j = 0; j < 5; j++){
					System.out.print("정수 : ");
					int t = stdIn.nextInt();
					if(t == 99999){
						break outer;
					}else if(t == 88888){
						continue outer;
					}
					total += t;
				}
			}
			System.out.println("\n합계는" + total + "입니다.");
			stdIn.close();
	}

}

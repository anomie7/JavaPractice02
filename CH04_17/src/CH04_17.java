import java.util.Scanner;

public class CH04_17 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = stdIn.nextInt();
		
		int count = 0;
		for(int i = 1; i <= n; i++){
			if(n%i == 0){
				count++;
				System.out.println(i);
			}
		}
		System.out.println("����� " + count + "���Դϴ�.");
		stdIn.close();
	}

}

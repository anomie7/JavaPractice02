import java.util.Scanner;

public class CH04_18 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.println(i +"�� ������ " + i*i);
		}
		stdIn.close();
	}

}

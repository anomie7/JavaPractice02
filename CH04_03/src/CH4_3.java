import java.util.Scanner;

public class CH4_3 {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("���� A : ");
	int a = stdIn.nextInt();
	
	System.out.print("���� B : ");
	int b = stdIn.nextInt();
	
	if(a > b){
		int tmp = a;
			a = b;
			b = tmp;
	}
	
	do{
		System.out.print(a + " ");
		a++;
	}while(a <= b);
	
	stdIn.close();
	}

}

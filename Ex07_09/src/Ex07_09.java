import java.util.Scanner;

public class Ex07_09 {
	
	static Scanner stdIn = new Scanner(System.in);
	static int n;
	
	static int readPlusInt(){
		do{
			System.out.print("양의 정수값 : ");
			n = stdIn.nextInt();
			
		}while(n <= 0);
		
		return n;
	}
	
	public static void main(String[] args){
		
		System.out.println(readPlusInt());
		
	}

}

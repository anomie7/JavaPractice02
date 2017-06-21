import java.util.Scanner;

public class IntArray2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		System.out.println("배열의 개수 입력 : ");
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++){
			a[i] = i +1;
		}
		
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		stdIn.close();
		
	}

}

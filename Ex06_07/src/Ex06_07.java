import java.util.Random;
import java.util.Scanner;

public class Ex06_07 {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = rand.nextInt(10) + 1;
		}
		
		System.out.print("배열 a의 모든 요소의 값\n{ ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(" }");
		
		System.out.print("검색할 수 : ");
		int key = stdIn.nextInt();
		
		int i;
		for(i = n-1; i >= 0; i--){
			if(arr[i] == key){
				break;
			}
		}
		if( i >= 0){
			System.out.println("이것은 a[" + i + "]에 있습니다.");
		} else{
			System.out.println("이것은 없습니다.");
		}
		stdIn.close();
	}

}

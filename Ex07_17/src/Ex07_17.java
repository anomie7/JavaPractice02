import java.util.Scanner;

public class Ex07_17 {
	
	public static int linearSearch(int[] x, int key){
		for(int i = x.length-1; i >= 0; i--){
			if(x[i] == key){
				return i;
			} 
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수는? : ");
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = stdIn.nextInt();
		}
		
		
		System.out.print("검색할 값은? : ");
		int ky = stdIn.nextInt();
		
		int idx = linearSearch(arr, ky);
		
		stdIn.close();
		
		if(idx == -1){
			System.out.println("이 값의 요소는 존재하지 않습니다.");
		} else {
			System.out.println("이 값은 arr[" + idx + "]에 있습니다.");
		}
		
		
	}

}

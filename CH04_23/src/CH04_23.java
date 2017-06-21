
public class CH04_23 {
	public static void main(String[] args){
		
		int n = 7;
		int t = n;
		
		for(int i = 1; i <= n; i++){
			for(int j = t; j > 0; j--){
				System.out.print(" ");
			}
			for(int k = 1; k <= (i - 1) * 2 + 1; k++){
				System.out.print(i);
			}
			System.out.println();
			t--;
		}
	}

}

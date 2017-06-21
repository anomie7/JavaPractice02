
public class EX04_24 {
	public static void main(String[] args){
		int n = 5;
		
		for(int i =0; i< n; i++){
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			
			for(int k = (n-i-1) * 2 + 1; k > 0; k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

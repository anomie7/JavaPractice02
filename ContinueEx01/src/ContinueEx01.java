
public class ContinueEx01 {
	public static void main(String[] args){
		for(int i = 1; i <= 100; i++){
			if(i %10 == 0){
				System.out.println();
			}
			if(i%5 != 0 && i < 10){
				System.out.print(" ");
			} 
			
			if(i%5 == 0){
				continue;
			}
			
			System.out.print(i + " ");
			
		}
		
	}

}

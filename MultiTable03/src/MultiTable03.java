
public class MultiTable03 {
	public static void main(String[] args){
		
		for(int i =1; i <= 9; i++){
			for(int j = 2; j<=9; j++){
				
//				System.out.print(j + "*" + i + "=" + i*j + " ");
//				
//				if(i*j >= 10){
//					System.out.print(" ");
//				} else {
//					System.out.print("  ");
//				}
				System.out.printf("%d*%d=%2d ", j, i, j*i);
			}
			System.out.println();
		}
	}
}

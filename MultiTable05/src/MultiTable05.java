
public class MultiTable05 {
	public static void main(String[] args){
		
		
		int i = 1;
		int j;
		do{
			j = 2;		
			do{
				
				System.out.printf("%d*%d=%2d ", j, i, j*i);
				j++;
			}while(j <= 9);
			i++;
			System.out.println();		
		}while(i <= 9);
	}

}

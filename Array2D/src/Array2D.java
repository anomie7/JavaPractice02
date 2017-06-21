import java.util.Random;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("За : ");
		int row = stdIn.nextInt();
		
		System.out.print("ї­ : ");
		int column = stdIn.nextInt();
		
		
		int[][] arr = new int[row][column];
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				arr[i][j] = rand.nextInt(100);
				System.out.println(arr[i][j] + " ");
			}
		}
		
		stdIn.close();
		
	}

}

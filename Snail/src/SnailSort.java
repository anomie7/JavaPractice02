
public class SnailSort {
	public static void main(String[] args){
		int n = 2;
		int cnt = 1;
		int row = 0;
		int col = 0;
		int num = 1;
		
		int[][] arr = new int[n][n];
		
		arr[0][0] = 1;
		
		for(int i = 1; i < n; i++){
			col++;
			cnt++;
			arr[row][col] = cnt;
		}
		
//		System.out.println(row + " "+ col);
		
		int i = 1;
		while(cnt < n*n){
			for(int j = 0; j < n-i; j++){
				cnt++;
				row += num;
				arr[row][col] = cnt;
			}
			
			num *= -1;
			
			for(int k = 0; k < n-i; k++){
				cnt++;
				col += num;
				arr[row][col] = cnt;
			}
		
			i++;
		}
		
//		for(int i = 0; i < n-2; i++){
//			cnt++;
//			row--;
//			arr[row][col] = cnt;
//		}
//		
//		for(int i = 0; i < n-2; i++){
//			cnt++;
//			col++;
//			arr[row][col] = cnt;
//		}
//		
//		for(int i = 0; i < n-3; i++){
//			cnt++;
//			row++;
//			arr[row][col] = cnt;
//		}
//		
//		for(int i = 0; i < n-3; i++){
//			cnt++;
//			col--;
//			arr[row][col] = cnt;
//		}
//		
//		for(int i = 0; i < n-4; i++){
//			cnt++;
//			row--;
//			arr[row][col] = cnt;
//		}
//		
//		for(int i = 0; i < n-4; i++){
//			cnt++;
//			col++;
//			arr[row][col] = cnt;
//		}
		
		for(int j = 0; j < n; j++){
			for(int k = 0; k < n; k++){
				System.out.printf("%4d", arr[j][k]);
			}
			System.out.println();
		}
		
		
	}

}

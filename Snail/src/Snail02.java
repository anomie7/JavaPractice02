import java.util.Scanner;

class Snail02
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner scanner = new Scanner(System.in);
	 	int variable = -1;
	 	
		int n = scanner.nextInt();
		
		int[][] arr = new int[n][n];
		int temp = n * n;
		
		int x = n - 1;
		int y = n;
		
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[j][i] = cnt;
				cnt += 1;
			}
		}
		
		while(n >= 0) {
			for(int i = 0; i < n; i++) {
				y += variable;
				System.out.print(arr[x][y] + " ");
			}
			n -= 1;
			
			for(int i = 0; i < n; i++) {
				x += variable;
				System.out.print(arr[x][y] + " ");
			}
			variable *= -1;
		}
		scanner.close();
		
	}
}
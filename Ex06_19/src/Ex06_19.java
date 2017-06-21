import java.util.Scanner;

public class Ex06_19 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("반 수 : ");
		int classNum = stdIn.nextInt();
		int[][] arr = new int[classNum][];
		
//		for(int i = 0; i < classNum; i++){
//			System.out.print((i+1) + "반의 인원: ");
//			int person = stdIn.nextInt();
//			arr[i] = new int[person];
//			
//		}
		
		for(int i = 0; i < classNum; i++){
			System.out.print((i+1) + "반의 인원: ");
			int person = stdIn.nextInt();
			arr[i] = new int[person];
			
			for(int j = 0; j < arr[i].length; j++){
				System.out.print((i+1)+ "반 " + (j+1) + "번의 점수 : ");
				arr[i][j] = stdIn.nextInt();
			}
			System.out.println();
		}
		
		
		int[] sum = new int[classNum];
		double[] avg = new double[classNum];
		for(int i = 0; i < classNum; i++){
			for(int j = 0; j < arr[i].length; j++){
				sum[i] += arr[i][j];
			}
			avg[i] = (double) sum[i] / arr[i].length;
		}
		
		int totalSum = 0;
		double totalAvg = 0.0;
		
		System.out.println("반\t합계\t평균");
		System.out.println("-------------------");
		for(int i = 0; i < classNum; i++){
				System.out.print((i+1) + "반\t" + sum[i] + "\t");
				System.out.printf("%3.1f",avg[i]);
				System.out.println();
				totalSum += sum[i];
				totalAvg += avg[i] / classNum;
		}
		
		System.out.println("-------------------");
		System.out.print("계\t" + totalSum + "\t");
		System.out.printf("%3.1f", totalAvg);
		
		stdIn.close();
	}

}

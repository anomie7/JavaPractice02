import java.util.Scanner;

public class Ex06_19 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		int classNum = stdIn.nextInt();
		int[][] arr = new int[classNum][];
		
//		for(int i = 0; i < classNum; i++){
//			System.out.print((i+1) + "���� �ο�: ");
//			int person = stdIn.nextInt();
//			arr[i] = new int[person];
//			
//		}
		
		for(int i = 0; i < classNum; i++){
			System.out.print((i+1) + "���� �ο�: ");
			int person = stdIn.nextInt();
			arr[i] = new int[person];
			
			for(int j = 0; j < arr[i].length; j++){
				System.out.print((i+1)+ "�� " + (j+1) + "���� ���� : ");
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
		
		System.out.println("��\t�հ�\t���");
		System.out.println("-------------------");
		for(int i = 0; i < classNum; i++){
				System.out.print((i+1) + "��\t" + sum[i] + "\t");
				System.out.printf("%3.1f",avg[i]);
				System.out.println();
				totalSum += sum[i];
				totalAvg += avg[i] / classNum;
		}
		
		System.out.println("-------------------");
		System.out.print("��\t" + totalSum + "\t");
		System.out.printf("%3.1f", totalAvg);
		
		stdIn.close();
	}

}

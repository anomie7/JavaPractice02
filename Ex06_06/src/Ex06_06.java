import java.util.Scanner;

public class Ex06_06 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int person = stdIn.nextInt();
		int[] point = new int[person];
		
		System.out.println(person + "���� ������ �Է��Ͻÿ�");
		for(int i = 0; i < person; i++){
			System.out.print((i+1) + "�� ���� : ");
			point[i] = stdIn.nextInt();
		}
		
		int sum = 0, max = point[0], min = point[0];
		for(int i = 0; i < person; i++){
			sum += point[i];
			
			if( point[i]> max){
				max = point[i];
			}
			if( point[i] < min){
				min = point[i];
			}
		}
		
		double ave = (double)sum/person;
		
		System.out.println("���� ���� : " + min);
		System.out.println("�ְ� ���� : " + max);
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + ave);
		stdIn.close();
	}

}

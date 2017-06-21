import java.util.Scanner;

public class Ex06_06 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("사람 수 : ");
		int person = stdIn.nextInt();
		int[] point = new int[person];
		
		System.out.println(person + "명의 점수를 입력하시오");
		for(int i = 0; i < person; i++){
			System.out.print((i+1) + "번 점수 : ");
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
		
		System.out.println("최저 점수 : " + min);
		System.out.println("최고 점수 : " + max);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);
		stdIn.close();
	}

}

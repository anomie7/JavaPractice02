import java.util.Scanner;

public class MaxOfHeightWeight {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("인원 수는? ");
		int person = stdIn.nextInt();
		
		int[] height = new int[person];
		int[] weight = new int[person];
		
		System.out.println(person + "명의 신장과 체중을 입력하십시오.");
		
		for(int i = 0; i < person; i++){
			System.out.print((i + 1) + "번의 신장 : ");
			height[i] = stdIn.nextInt();
			System.out.print((i+1) + "번의 체중 : ");
			weight[i] = stdIn.nextInt();
		}
		
		System.out.println("가장 키가 큰 사람의 신장 : " + maxOf(height) + "cm");
		System.out.println("가장 뚱뚱한 사람의 체중 : " + maxOf(weight) + "kg");
	}

	public static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
	}

}

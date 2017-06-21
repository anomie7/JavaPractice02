import java.util.Scanner;

public class LinearSearch02 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
//		System.out.print("��� ����? : ");
//		int num = stdIn.nextInt();
//		int[] x = new int[num];
//		
//		for(int i = 0; i < num; i++){
//			System.out.print("x[" + i + "] : ");
//			x[i] = stdIn.nextInt();
//		}
		
		System.out.print("�˻��� ����? : ");
		int ky = stdIn.nextInt();
		
//		int idx = linearSearch(x, ky);
		int idx = linearSearch(new int[]{15, 25, 45, 55}, ky);
		
		if(idx == -1){
			System.out.println("�� ���� ��Ҵ� �������� �ʽ��ϴ�.");
		} else{
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}
	}

	public static int linearSearch(int[] a, int key) {
		for(int i = 0; i < a.length; i++){
			if(a[i] == key){
				return i;
			}
		}
		return -1;
	}

}

import java.util.Scanner;

public class ChangeString {
	public static void main(String[] args){
		String s1 = "ABC";
		String s2 = "XYZ";
		
		s1 = "XYZ";
		System.out.println("���ڿ� s1 = " + s1);
		System.out.println("���ڿ� s2 = " + s2);
		System.out.println("s1�� s2�� ���� ���ڿ� ���ͷ��� ����" + 
						   ((s1 == s2) ? " �ϰ� �ִ�." : "���� �ʴ´�." ) );
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ� a : ");
		String a = stdIn.nextLine();
		
		System.out.print("���ڿ� b : ");
		String b = stdIn.nextLine();
		
		System.out.println("s1�� s2�� ���� ���ڿ� ���ͷ��� ����" + 
				   ((a == b) ? " �ϰ� �ִ�." : "���� �ʴ´�." ) );
		
		System.out.println("s1�� s2�� ���� ���ڿ��� ������ f" + 
				   ((a.equals(b)) ? " �����Ѵ�." : "�������� �ʴ´�." ) );
		
	}

}

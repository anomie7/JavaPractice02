import java.util.Scanner;

public class SearchString {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ� s1 : ");
		String s1 = stdIn.next();
		
		System.out.print("���ڿ� s2 : ");
		String s2 = stdIn.next();
		
		int idx = s1.lastIndexOf(s2);
		if (idx == -1){
			System.out.println("s1 ���� s2�� ���Ե��� �ʽ��ϴ�.");
		} else{
			System.out.println("s1�� " + (idx+1) + "���� ���ڿ� s2�� ���ԵǾ� �ֽ��ϴ�.");
		}
		
		stdIn.close();
	}

}

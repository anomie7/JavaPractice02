import java.util.Scanner;

public class Parindrome01 {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("ȸ���Ǻ����Դϴ�.");
	System.out.print("���ڸ� �Է����ּ���. : ");
	String s = stdIn.next();
	
	for(int i =0; i < (s.length())/2; i++){
		if(s.charAt(i) == s.charAt((s.length()-1)-i)){
			if(i == s.length()/2-1){
				System.out.println("ȸ���Դϴ�.");
			}
		}else if (s.charAt(i) != s.charAt((s.length()-1)-i)) {
			System.out.println("ȸ���� �ƴմϴ�.");
			break;
		}
	}
		stdIn.close();
	}

}

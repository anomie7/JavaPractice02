import java.util.Scanner;

public class Parindrome01 {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("회문판별식입니다.");
	System.out.print("문자를 입력해주세요. : ");
	String s = stdIn.next();
	
	for(int i =0; i < (s.length())/2; i++){
		if(s.charAt(i) == s.charAt((s.length()-1)-i)){
			if(i == s.length()/2-1){
				System.out.println("회문입니다.");
			}
		}else if (s.charAt(i) != s.charAt((s.length()-1)-i)) {
			System.out.println("회문이 아닙니다.");
			break;
		}
	}
		stdIn.close();
	}

}

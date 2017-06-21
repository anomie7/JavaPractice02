import java.util.Scanner;

public class Ex_1152 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.nextLine();
		
		System.out.println(str);
		
		int count =0;
		
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == ' ' && str.charAt(i-1) != ' '){
				count++;
			} 			
		}
		if(str.charAt(str.length()-1) == ' '){
			count--;
		}
		
		System.out.println(count+1);
	}

}

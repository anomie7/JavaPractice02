package TeskSet02;
import java.util.Scanner;
import java.util.TreeMap;

public class TeskSet22 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			System.out.print("$ ");
			String command = stdIn.next();
			
			if(command.equals("test")){
				boolean isAnagram = compareStr(stdIn.next(), stdIn.next());
			}else if(command.equals("exit")){
				break;
			}
		}
	}

	private static boolean compareStr(String s1, String s2) {
		if(s1.length() != s2.length()){
			return false;
		}else{
			getIndex(s1);
		}
		return false;
	}

	private static void getIndex(String s1) {
		TreeMap<Character, Integer> index = new TreeMap<Character, Integer>();
		
		for(int i =0; i < s1.length()-1; i++){
			if(index.get(s1.charAt(i)) == null ){
					
			}else{
				
			}
		}
	}
}

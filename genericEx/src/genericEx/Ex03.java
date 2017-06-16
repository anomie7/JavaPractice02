package genericEx;

import java.util.*;


public class Ex03 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		for(int i = 0; i < 4; i++){
			nations.put(stdIn.next(), stdIn.nextInt());
		}
		
//		Set<String> keys = nations.keySet();
//		Iterator<String> it = keys.iterator();
//		while(it.hasNext()){
//			String tmp = it.next();
//			System.out.print(nations.get(tmp) + " ");
//		}
			System.out.print("찾고 싶은 나라 : ");
			System.out.println(nations.get(stdIn.next()));	
			stdIn.close();
	}

}

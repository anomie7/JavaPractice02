package genericEx;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		ArrayList<Character> a = new ArrayList<Character>();
		
		System.out.print("A부터 F까지 차례대로 입력해주세요.");
		for(int i = 0; i < 5; i++){
			a.add(stdIn.next().charAt(0));
		}
		
		System.out.print("검색할 학점 : ");
		char key = stdIn.next().charAt(0);
		
		cmpScore(a.indexOf(key), key);
		
		stdIn.close();
//		Iterator<Character> it = a.iterator();
//		while(it.hasNext()){
//			char c = it.next();
//			System.out.print(c + " ");
//		}
	}

	private static void cmpScore(int i, char key) {
		Double[] arr = {4.0, 3.0, 2.0, 1.0, 0.0};
		System.out.println(key + "=" + arr[i]);	
	}
}

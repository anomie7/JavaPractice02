package genericEx;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		Vector<Double> v = new Vector<Double>();
		
		for(int i = 0; i < 10; i++){
			v.add(stdIn.nextDouble());
		}
		stdIn.close();
		
		Double max = v.get(0);
		for(int i = 1; i < v.size(); i++){
			if(v.get(i) > max){
				max = v.get(i);
			}
		}
		
		System.out.println(max);
	}

}

package genericEx;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args){
		ArrayList<Double> a = new ArrayList<Double>();
		for(int i = 0; i < 20; i++){
			double d = Math.random()*100;
			a.add(d);
		}
		
		Iterator<Double> it = a.iterator();
		while(it.hasNext()){
			double d = it.next();
			System.out.printf("%3.2f ", d);
		}
	}

}

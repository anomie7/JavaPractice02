import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class test {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		while(true){
			v.add(stdIn.nextInt());
			
			int n = stdIn.nextInt();
			if(n == 100){
				break;
			}
		}
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()){
			int n = it.next();
			System.out.print(n + " ");
		}
		
	}

}

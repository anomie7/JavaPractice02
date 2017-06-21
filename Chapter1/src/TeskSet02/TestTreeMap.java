package TeskSet02;

import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args){
		TreeMap<Character, Integer> index = new TreeMap<Character, Integer>();
		
		index.put('a', 1);
		index.put('c', 3);
		
		int c = index.get('a').intValue();
		c++;
		index.put('a', c);
		
		System.out.println(index.get('a'));
	}
}

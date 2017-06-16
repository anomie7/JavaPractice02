package genericEx;
import java.util.*;
class HV{
	public static Vector<String> hashToVector(HashMap<String, String> h){
		Vector<String> v = new Vector<String>();
		
		Set<String> keys = h.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()){
			String k = itr.next();
			v.add(h.get(k));
		}
		return v;
	}
}
public class Ex07 {
	public static void main(String[] args){
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		Vector<String> v = HV.hashToVector(h);
		
		for(int n = 0; n < v.size(); n++){
			System.out.println(v.get(n));
		}
	}
}

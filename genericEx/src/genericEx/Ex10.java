package genericEx;
import java.util.*;

class Location{
	private String name;
	private int lat;
	private int longtd;
	
	public Location(String name, int lat, int longtd){
		this.name = name;
		this.lat = lat;
		this.longtd = longtd;
	}
	
	public String toString(){
		return "지명 : " + name + "\n" + "위도 : "+ lat + "\n" + "경도 : " + longtd;
	}
}

public class Ex10 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		HashMap<String, Location> h = new HashMap<String, Location>();
		
		for(int i =0; i < 5; i++){
			String str = stdIn.next();
			int n1 = stdIn.nextInt();
			int n2 = stdIn.nextInt();
			
			h.put(str, new Location(str, n1, n2));
		}
//		System.out.print("지명 입력 : ");
//		String key = stdIn.next();
//		System.out.println(h.get(key));
		stdIn.close();
		
		Set<String> keys = h.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()){
			System.out.println(h.get(itr.next()));
		}
	}

}

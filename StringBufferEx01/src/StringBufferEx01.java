
public class StringBufferEx01 {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("a");
		
		sb.append(" pencil");
		sb.insert(2, "nice ");
		sb.replace(2, 6, "bad");
		sb.delete(0, 2);
		sb.reverse();
		//int n = sb.length();
		char c = sb.charAt(3);
		
		System.out.println(c);
		System.out.println(sb);
	}

}

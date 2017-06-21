
public class StringBufferEx02 {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb.append(" is pencil");
		System.out.println(sb);
		sb.insert(7, "my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		sb.setLength(6);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		
		String s = "I Love ";
		System.out.println(s.hashCode());
		s = s.concat("java");
		
		System.out.println(s.hashCode());
	}
}

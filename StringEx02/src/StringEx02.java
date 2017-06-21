
public class StringEx02 {
	public static void main(String[] args){
//		System.out.println("abcd".concat("efgh"));
//		String a = "    abcd  def   ";
//		String b = "\txyz\t";
//		String c = a.trim();
//		String d = b.trim();
//		
//		System.out.println(a);
//		System.out.println(b + "자바");
//		System.out.println(c);
//		System.out.println(d);
		
		String a = "패키지 개념과 자바 기본 패키지, 자바를 자바라";
		char c = a.charAt(4);
		System.out.println(c);
		
		int count = 0;
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) == ' '){
				count++;
			}
		}
		System.out.println(count);
	}

}

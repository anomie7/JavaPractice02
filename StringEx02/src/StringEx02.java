
public class StringEx02 {
	public static void main(String[] args){
//		System.out.println("abcd".concat("efgh"));
//		String a = "    abcd  def   ";
//		String b = "\txyz\t";
//		String c = a.trim();
//		String d = b.trim();
//		
//		System.out.println(a);
//		System.out.println(b + "�ڹ�");
//		System.out.println(c);
//		System.out.println(d);
		
		String a = "��Ű�� ����� �ڹ� �⺻ ��Ű��, �ڹٸ� �ڹٶ�";
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

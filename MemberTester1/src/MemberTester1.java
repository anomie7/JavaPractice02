
public class MemberTester1 {
	public static void main(String[] args){
		Member[] m = {
				new Member ("�ϳ�", 101, 27),
				new SpecialMember ("�θ�", 102, 31, "ȸ�� ����"),
				new SpecialMember ("�Ƹ�", 103, 52, "ȸ�� �ݾ׹���"),
				new SpecialMember ("minu", 104, 26, "ȸ�� 1�� ����")
		};
		
		SpecialMember a = new SpecialMember("dodam", 105, 22, "�ٺ�");
		
		for (Member i : m){
			i.print();
			System.out.println(i.toString());
			System.out.println();
		}
		
		a.printf();
	}

}

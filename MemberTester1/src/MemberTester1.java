
public class MemberTester1 {
	public static void main(String[] args){
		Member[] m = {
				new Member ("하나", 101, 27),
				new SpecialMember ("두리", 102, 31, "회비 무료"),
				new SpecialMember ("아름", 103, 52, "회비 반액무료"),
				new SpecialMember ("minu", 104, 26, "회비 1년 무료")
		};
		
		SpecialMember a = new SpecialMember("dodam", 105, 22, "바보");
		
		for (Member i : m){
			i.print();
			System.out.println(i.toString());
			System.out.println();
		}
		
		a.printf();
	}

}

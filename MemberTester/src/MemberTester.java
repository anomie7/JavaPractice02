class Member{
	private String name;
	private int no;
	private int age;
	
	Member(String name, int no, int age){
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	void print() {
		System.out.println("No." + no + " : " + name + " (" + age + "��) ");
	}
	
}

public class MemberTester {
	
	public static void main(String[] args) {
		Member minu = new Member("�ο�", 921202, 26);
		Member youngjin = new Member("����", 1357, 25);
		
		youngjin.print();
		minu.print();
		
	}

}

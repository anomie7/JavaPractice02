
public class SpecialMember extends Member{
	
	private String privilege;
	
	public SpecialMember(String name, int no, int age, String privilege){
		super(name, no, age);
		this.privilege = privilege;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println("특전 : " + privilege);
	}
	public void printf(){
		System.out.println("참조되지 않는다.");
	}

}

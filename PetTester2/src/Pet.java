
public class Pet {
	private static String name;
	private static String masterName;
	
	public Pet(String name, String masterName){
		this.name = name;
		this.masterName = masterName;
		
	}
	
	public static String getName(){
		return name;
	}
	public static String getMasterName(){
		return masterName;
	}
	public static void introduce() {
		System.out.println("■ 내 이름은 " + name + "입니다.");
		System.out.println("■ 주인님은 " + masterName + "입니다.");
	}

}

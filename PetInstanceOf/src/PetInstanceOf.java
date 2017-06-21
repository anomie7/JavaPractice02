
public class PetInstanceOf {
	public static void main(String[] args){
		Pet[] a = {
				new Pet("Kurt", "아이"),
				new RobotPet("R2D2", "루크"),
				new Pet("마이클", "영진"),
		};
		
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] ");
			if(a[i] instanceof RobotPet){
				a[i].introduce();
			} else {
				System.out.println("로봇펫 아니다.");
			}
		}
	}

}


public class PetInstanceOf {
	public static void main(String[] args){
		Pet[] a = {
				new Pet("Kurt", "����"),
				new RobotPet("R2D2", "��ũ"),
				new Pet("����Ŭ", "����"),
		};
		
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] ");
			if(a[i] instanceof RobotPet){
				a[i].introduce();
			} else {
				System.out.println("�κ��� �ƴϴ�.");
			}
		}
	}

}

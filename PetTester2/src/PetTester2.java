
public class PetTester2 {
		static void intro(Pet p){
			p.introduce();
		}
		
		public static void main(String[] args){
			Pet[] a = {
					new Pet("Kurt", "����"),
					new RobotPet("R2D2", "��ũ"),
					new Pet("����Ŭ", "����"),
					new RobotPet("minuPet", "minu")
			};
			
			for(Pet p : a){
				intro(p);
				System.out.println();
			}
	}

}

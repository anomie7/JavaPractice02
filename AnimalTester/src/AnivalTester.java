
public class AnivalTester {
	public static void main(String[] args){
		Animal[] a = {
				new Dog("�ٵ���", "��찳"),
				new Cat("�Ʒ���", 7),
				new Dog("���", "������"),
		};
		
		for (Animal k : a){
			k.introduce();
			System.out.println();
		}
		
	}

}

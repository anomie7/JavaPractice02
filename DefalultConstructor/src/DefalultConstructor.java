class A{
	private int a;
	
	A(){ 
		a = 50;
	}
	
	int getA() {
		return a;
	}
}

class B extends A{
	B(){
		super();
	}
}
public class DefalultConstructor {
	public static void main(String[] args){
		B x = new B();
		
		System.out.println("x.getA() = " + x.getA());
	}

}

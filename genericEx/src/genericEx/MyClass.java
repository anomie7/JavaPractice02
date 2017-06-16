package genericEx;

public class MyClass<T> {
	private T s;
	
	public MyClass(T s){
		this.s = s;
	}
	void SetT(T s){
		this.s = s;
	}
	T getT(){
		return s;
	}
	public static void main(String[] args){
		MyClass<String> s = new MyClass<String>("fuck");
		
		System.out.println(s.getT());
		s.SetT("fuck me");
		System.out.println(s.getT());
		
		MyClass<Integer> i = new MyClass<Integer>(333);
		
		System.out.println(i.getT());
		i.SetT(444);
		System.out.println(i.getT());
	}
}


public class Argument {
	public static void main(String[] args){
		int i = 0;
		method(i, i=5, ++i);
		
		int a = 4;
		int b = 128;
		System.out.println(a << 4);
		System.out.println(b >> 3);
	}

	public static void method(int a, int b, int c) {
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}

}

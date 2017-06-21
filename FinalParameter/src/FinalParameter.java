
public class FinalParameter {
	static int sumOf(final int a, final int b, final int c){
//		a = 10;
		return a + b + c;
	}
	public static void main(String[] args){
		System.out.println(sumOf(1, 2, 3));
		
	}

}

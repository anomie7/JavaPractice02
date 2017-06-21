

public class ExceptionTest {
	public static void main(String[] args){
		try{
			method();
		}catch(Exception e){
			System.out.print("E");
		}
	}
	static void method(){
		try{
			testEx();
			System.out.print("A");
		}catch(ArithmeticException e){ 
			System.out.print("B");
		}finally{
			System.out.print("C");
		}
		System.out.print("D");
	}
	static void testEx(){
		throw new NullPointerException();
	}
}

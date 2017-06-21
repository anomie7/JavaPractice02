
public class DecOctHexLiteral {
	public static void main(String[] args){
		
		int a = 13;
		int b = 013;
		int c = 0x13;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.printf("a = %d\n", a);
		System.out.printf("b = %o\n", b);
		System.out.printf("c = %x\n", c);
		
		System.out.printf("a = %d\n", 13);
		System.out.printf("b = %o\n", 15);
		System.out.printf("c = %x\n", 0xd);
	}

}

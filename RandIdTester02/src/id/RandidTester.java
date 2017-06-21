package id;
import id.RandId;

public class RandidTester {
	public static void main(String[] args){
		id.RandId a = new RandId();
		id.RandId b = new RandId();
		id.RandId c = new RandId();
		
		System.out.println("a의 식별번호 : " + a.getId());
		System.out.println("b의 식별번호 : " + b.getId());
		System.out.println("c의 식별번호 : " + c.getId());
	}
}

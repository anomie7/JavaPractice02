package id;
import id.RandId;

public class RandidTester {
	public static void main(String[] args){
		id.RandId a = new RandId();
		id.RandId b = new RandId();
		id.RandId c = new RandId();
		
		System.out.println("a�� �ĺ���ȣ : " + a.getId());
		System.out.println("b�� �ĺ���ȣ : " + b.getId());
		System.out.println("c�� �ĺ���ȣ : " + c.getId());
	}
}

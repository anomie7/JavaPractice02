/**
 * Ŭ���� Point�� ���� ��Ÿ���� Ŭ�����Դϴ�.
 * �� Ŭ������ ������ ��Ÿ���� Ŭ���� Shape�κ��� �Ļ��� Ŭ�����Դϴ�.
 * �ʵ�� �����ϴ�.
 * @author dbs84
 *
 */
public class Point extends Shape {
	
	/**
	 * ���� �����ϴ� �������Դϴ�.
	 * ���� �޴� �μ��� �����ϴ�.
	 */
	public Point() { }
	
	/**
	 * method toString�� ���� ���� ���� ������ ��Ÿ���� ���ڿ��� ��ȯ�մϴ�.
	 * ��ȯ�ϴ� ���ڿ��� �׻� "Point"�Դϴ�.
	 * @return ���ڿ� "Point"�� ��ȯ�մϴ�.
	 */
	public String toString() {
		return "Point";
	}
	/**
	 * method draw�� ���� �׸��� �޼ҵ��Դϴ�.
	 * �÷��� ��ȣ '+'�� 1���� ǥ���ϰ� �� �ٲ��� �մϴ�.
	 */
	public void draw(){
		System.out.println('+');
	}
}

/**
 * Ŭ���� HorzLine�� ���������� ��Ÿ���� Ŭ�����Դϴ�.
 * �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� AbstLine���κ��� �Ļ��� Ŭ�����Դϴ�.
 * @author dbs84
 *@see Shape
 *@see AbstLine
 */
public class HorzLine extends AbstLine{
	/**
	 * ���������� �����ϴ� Ŭ�����Դϴ�.
	 * ���̸� �μ��� ���޹޽��ϴ�.
	 * @param length ������ ������ ����
	 */
	public HorzLine(int length) {
		super(length);
	}
	
	/**
	 * method toString�� ���������� ���� ���������� ��Ÿ���� ���ڿ��� ��ȯ�մϴ�.
	 * @return ���ڿ� "HorzLine(lenght:3)"�� ��ȯ�մϴ�.
	 * 				3�� ������ ���Դϴ�.
	 */
	public String toString() {
		return "HorzLine(length:" + getLength() + ")";
	}
	
	/**
	 * method draw�� ���������� �׸��ϴ�.
	 * �׸���� ���̳ʽ� ��ȣ '-'�� ���η� �����մϴ�.
	 * ������ ������ŭ '-'�� ���� ǥ���ϰ� �� �ٲ��� �մϴ�.
	 */
	public void draw() {
		for(int i = 1; i <= getLength(); i++){
			System.out.print('-');
		}
		System.out.println();
	}
}

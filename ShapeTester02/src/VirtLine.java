/**
 * Ŭ���� VirtLine�� ���������� ��Ÿ���� Ŭ�����Դϴ�.
 * �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� AbstLine���κ��� �Ļ��� Ŭ�����Դϴ�.
 * @author dbs84
 *@see Shape
 *@see AbstLine
 */
public class VirtLine extends AbstLine {
	/**
	 * ���������� �����ϴ� Ŭ�����Դϴ�.
	 * ���̸� �μ��� ���޹޽��ϴ�.
	 * @param length ������ ������ ����
	 */
	public VirtLine(int length) {
		super(length);
	}
	
	/**
	 * method toString�� ���������� ���� ���������� ��Ÿ���� ���ڿ��� ��ȯ�մϴ�.
	 * @return ���ڿ� "VirtLine(lenght:3)"�� ��ȯ�մϴ�.
	 * 				3�� ������ ���Դϴ�.
	 */
	public String toString(){
		return "VirtLine(length:" + getLength() + ")";
	}
	/**
	 * method draw�� ���������� �׸��ϴ�.
	 * �׸���� ������ȣ '|' �� ���η� �����մϴ�.
	 * ������ ������ŭ '|'�� ǥ���ϰ� �� �ٲ� �ϴ� ���� �ݺ��մϴ�.
	 */
	public void draw(){
		for(int i = 1; i <= getLength(); i++){
			System.out.println('|');
		}
	}
	

}

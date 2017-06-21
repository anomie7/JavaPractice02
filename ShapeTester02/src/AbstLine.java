/**
 * Ŭ���� AbstLine�� ������ ��Ÿ���� �߻�Ŭ�����Դϴ�.
 * �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� Shape�κ��� �Ļ��� Ŭ�����Դϴ�.
 * �߻� Ŭ�����̱� ������ �� Ŭ������ �ν��Ͻ��� ������ ���� �����ϴ�.
 * ��ü���� ���� Ŭ������ �� Ŭ�����κ��� �Ļ��˴ϴ�.
 * @author dbs84
 *
 */
public abstract class AbstLine extends Shape {
	/**
	 * ������ ���̸� ��Ÿ���� int�� �ʵ�
	 */
	private int length;
	
	/**
	 * ������ �����ϴ� ������
	 * ���̸� �μ��� ���޹޴´�.
	 * @param length ������ ������ ����.
	 */
	public AbstLine(int length){
		setLength(length);
	}
	
	/**
	 * ������ ���̸� ����մϴ�.
	 * @return ������ ����
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * ������ ���̸� �����մϴ�.
	 * @param length ������ ������ ����
	 */
	public void setLength(int length){
		this.length = length;
	}
	
	/**
	 * method toString�� ������ ���� ���������� ��Ÿ���� ���ڿ��� ��ȯ�մϴ�.
	 * @return ���ڿ� "AbstLint(length:3)"�� ��ȯ�մϴ�.
	 * 					3�� ���̰��Դϴ�.
	 */
	public String toString(){
		return "AbstLine(length:" + length + ")";
	}

}

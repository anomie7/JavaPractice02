
public class PortablePlayer implements Skinnable, Player{
	//private int skin = BLACK;
	
	public PortablePlayer() {}
	
	public void play() {
		System.out.println("�� �������");
	}
	
	public void stop() {
		System.out.println("�� �������!");
	}
	
	public void changeSkin(int skin){
		System.out.print("��Ų�� ");
		switch(skin){
		case BLACK:
			System.out.print("����");
			break;
		case RED:
			System.out.print("����");
			break;
		case GREEN:
			System.out.print("���");
			break;
		case BLUE:
			System.out.print("�Ķ�");
			break;
		case LEOPARD:
			System.out.print("ǥ�� ����");
			break;
		default:
			System.out.print("�⺻��");
			break;
		}
		System.out.println("(��)�� �����߽��ϴ�.");
	}

}

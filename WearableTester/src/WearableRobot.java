
public class WearableRobot implements Wearable, Color{
	private int color;
	
	public WearableRobot(int color){
		changeColor(color);
		
	}
	public void changeColor(int color){
		this.color = color;
	}
	
	public String toString(){
		switch(color){
		case RED:
			return "���� �κ�";
		case GREEN:
			return "�ʷ� �κ�";
		case BLUE:
			return "�Ķ� �κ�";
		}
		return "�κ�";
	}
	public void putOn(){
		System.out.println(toString() + " ����!");
	}
	public void putOff(){
		System.out.println(toString() + "����!");
	}
}

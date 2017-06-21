
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
			return "»¡°­ ·Îº¿";
		case GREEN:
			return "ÃÊ·Ï ·Îº¿";
		case BLUE:
			return "ÆÄ¶õ ·Îº¿";
		}
		return "·Îº¿";
	}
	public void putOn(){
		System.out.println(toString() + " ÀåÂø!");
	}
	public void putOff(){
		System.out.println(toString() + "ÇØÁ¦!");
	}
}

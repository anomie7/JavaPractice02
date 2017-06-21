package point;import java.awt.geom.Point2D;

public class point2D01 {
	private int x = 0;
	private int y = 0;
	public Point2D(){
			
	}
	public void Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void Point2D(Point2D p){
		this(p.x, p.y);
	}
	public String toStrint(){
		return "(" + x + "," + y + ")"; 
	}

}

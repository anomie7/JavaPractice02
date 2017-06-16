package genericEx;
import java.util.*;
abstract class GraphicObject{
	int x, y, w, h;
	GraphicObject(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public abstract void view();
}
class Rect extends GraphicObject{
	public Rect(int x, int y, int w, int h){
		super(x, y, w, h);
	}
	public void view(){
		System.out.println(x + "," + y + " -> " + w + "," + h + "�� �簢��");
	}
}

class Line extends GraphicObject{
	public Line(int x, int y, int w, int h){
		super(x, y, w, h);
	}
	
	public void view(){
		System.out.println(x + "," + y + " -> " + w + "," + h + "�� ��");
	}
}

public class GraphicEditor {
	Vector<GraphicObject> v = new Vector<GraphicObject>();
	
	void add(GraphicObject ob){
		v.add(ob);
	}
	void draw(){
		for(int i =0; i < v.size(); i++){
			v.get(i).view();
		}
	}
	
	public static void main(String[] args){
		GraphicEditor g = new GraphicEditor();
		g.add(new Rect(2,2,3,4));
		g.add(new Line(3,3,8,8));
		g.add(new Line(2,5,6,6));
		g.add(new Rect(6,6,6,7));
		
		g.draw();
	}
}

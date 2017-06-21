
public class ShapeTester01 {
	public static void main(String[] args){
		//Shape s = new Shape();
		
		Shape[] a = new Shape[2];
		a[0] = new Point();
		a[1] = new Rectangle(4, 3);
		
		for(Shape i : a){
			i.draw();
			System.out.println();
		}
	}
}

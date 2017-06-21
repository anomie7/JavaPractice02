
public class ShapeTester02 {
	public static void main(String[] args){
		Shape[] p = new Shape[5];
		
		p[0] = new Point();
		p[1] = new HorzLine(5);
		p[2] = new VirtLine(3);
		p[3] = new Rectangle(4,3);
		p[4] = new Parallelogram(7, 3);
		
//		Plane2D[] d = new Plane2D[2];
//		d[0] = new Rectangle(4,3);
//		d[1] = new Parallelogram(7, 3);
		
		for(Shape i: p){
			i.print();
			if(i instanceof Plane2D){
				System.out.println(((Plane2D)i).getArea());
			}
			System.out.println();
		}
		
//		for(Plane2D j : d){
//			System.out.println(j.getArea() + " ¿‘¥œ¥Ÿ.");
//		}
		
		
	}

}


public class Forin2DArray {
	public static void main(String[] args){
		double[][] a = { {1.0, 2.0}, {3.0, 4.0, 5.0}, {6.0, 7.0} };
		
//		»Æ¿Â forπÆ
		/*for(double[] i : a){
			for(double j : i){
				System.out.printf("%5.1f", j);
			}
			System.out.println();
		}*/
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.printf("%5.1f", a[i][j]);
			}
			System.out.println();
		}
	}

}

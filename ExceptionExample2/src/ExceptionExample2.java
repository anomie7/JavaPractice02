
public class ExceptionExample2 {
	public static void main(String[] args){
		int[] intArr = new int[5];
		
		try{
			intArr[3] = 3;
			intArr[6] = 5;
		}catch(ArrayIndexOutOfBoundsException e){
		System.err.println("배열의 범위를 초과하여 원소를 접근하였습니다.");	
		}
//		
		for(int i =0; i<intArr.length; i++){
			System.out.println("intArr[" + i + "] = " + intArr[i]);
		}
	}

}

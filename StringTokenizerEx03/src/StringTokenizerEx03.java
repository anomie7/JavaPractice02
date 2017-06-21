import java.util.StringTokenizer;

public class StringTokenizerEx03 {
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("2+3+5+66+88+323", "+");
		
		int n = st.countTokens();
		String[] str = new String[n];
				
				
		for(int i = 0; i < n; i++){
			str[i] = st.nextToken();
		}
		
		Integer[] arr = new Integer[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = new Integer(str[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i].intValue();
		}
		
		System.out.println(sum);
	}

}

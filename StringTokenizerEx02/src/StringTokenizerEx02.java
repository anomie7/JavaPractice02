import java.util.StringTokenizer;

public class StringTokenizerEx02 {
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/");
		
//		while(st.hasMoreTokens()){
//			System.out.println(st.nextToken());
//		}
		
		int n = st.countTokens();
		
		for(int i = 0; i < n; i++){
			System.out.println(st.nextToken());
		}
	}

}

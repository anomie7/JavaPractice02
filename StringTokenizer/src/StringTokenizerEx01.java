import java.util.StringTokenizer;

public class StringTokenizerEx01 {
	public static void main(String[] args){
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&", true);
		
//		int n = st.countTokens();
//		System.out.println(n);
//		
//		for(int i =0; i < n; i++){
//			String token = st.nextToken();
//			System.out.println(token);
//		}
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
	}

}

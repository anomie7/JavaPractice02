import java.io.*;
import java.util.*;
public class FileEx05_b {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		TreeMap<String, String> store = new TreeMap<String, String>();
		
		System.out.print("파일1 : ");
		File file1 = new File(stdIn.next());
		
		System.out.print("파일2 : ");
		File file2 = new File(stdIn.next());
		
		stdIn.close();
		
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file1));
			
			while(true){
				String str = bf.readLine();
				if(str == null) break;
				store.put(str, str);
			}
			
			bf = new BufferedReader(new FileReader(file2));
			
			boolean isEqual = true;
			while(true){
				String str = bf.readLine();
				if(str == null) {
					break;
				}
				
				String tmp = store.get(str);
				if(tmp == null) {
					isEqual = false;
					System.out.println("다른 파일입니다.");
					break;
				}
			}
			if(isEqual){
				System.out.println("같은 파일입니다.");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("파일을 찾기 못했습니다.");
		}catch (IOException e){
			System.err.print("입출력 오류");
			
		}
	}
}

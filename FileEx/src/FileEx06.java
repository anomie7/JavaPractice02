import java.io.*;
import java.util.*;
public class FileEx06 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("파일명 : ");
		File f = new File(stdIn.next());
		stdIn.close();
		
		ArrayList<String> strList = new ArrayList<String>();
		BufferedReader in = null;
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		try {
			in = new BufferedReader(new FileReader(f));
			
			while(true){
				String str = in.readLine();
				if(str == null) break;
				strList.add(str);
			}
			
			for(int i = 0; i < strList.size(); i++){
				out.write((i+1) + " " + strList.get(i) + "\n");
			}
			
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽어들일 수 없습니다.");
		}catch(IOException e){
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}

}

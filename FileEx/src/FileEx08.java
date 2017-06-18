import java.io.*;
import java.util.*;
public class FileEx08 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("파일1 : ");
		File f1 = new File(stdIn.next());
		
		System.out.print("파일2 : ");
		File f2 = new File(stdIn.next());
		
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		long c;
		long len = (f1.length() / 10) + (f1.length()%10);
		byte[] b = new byte[(int) len];
		System.out.println(len + " " + f1.length());
		try {
			in = new BufferedInputStream(new FileInputStream(f1));
			out = new BufferedOutputStream(new FileOutputStream(f2));
			
			while(true){
				c = in.read(b);
				if(c == -1) break;
				out.write(b);
				
				System.out.print("* ");
			
			}
			
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못하였습니다.");
		} catch (IOException e){
			System.out.println("입출력 오류");
		}
	}
}

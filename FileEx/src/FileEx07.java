import java.util.*;
import java.io.*;
public class FileEx07 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����1 : ");
		File f1 = new File(stdIn.next());
		
		System.out.print("����2 : ");
		File f2 = new File(stdIn.next());
		
		stdIn.close();
		
		int c;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		try {
			byte[] b = new byte[1000];
			in = new BufferedInputStream(new FileInputStream(f1));
			out = new BufferedOutputStream(new FileOutputStream(f2));
			
			while(true){
				c = in.read(b, 0, b.length);
				if(c == -1) break;
				out.write(b, 0, b.length);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch(IOException e){
			System.out.println("����� ����");
		}
	}
}

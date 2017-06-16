import java.io.*;
public class FileEx02 {
	public static void main(String[] args){
		File f1 = new File("c:\\tmp\\lowcase.txt");
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(f1);
			fout = new FileOutputStream("c:\\tmp\\uppercase.txt");
			
			int c;
			while((c = fin.read()) != -1){
				fout.write( Character.toUpperCase((char)c));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

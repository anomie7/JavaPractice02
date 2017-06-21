import java.io.*;
public class FileReadHangulSuccess {
	public static void main(String[] args){
		InputStreamReader in = null;
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("c:\\tmp\\hangul.txt");
			in = new InputStreamReader(fin, "ms949");
			
//			in = new InputStreamReader(fin, "US-ASCII");
					
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while((c = in.read()) != -1){
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(FileNotFoundException e){
			System.err.println("������ �߰����� ���߽��ϴ�.");
		}catch(IOException e){
			System.err.println("����� ����");
		}catch(Exception e){
			System.err.println("���� �߻�");
		}
	}
}

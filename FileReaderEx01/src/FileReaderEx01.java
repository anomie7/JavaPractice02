import java.io.*;
public class FileReaderEx01 {
	public static void main(String[] args){
		FileReader in = null;
		try{
			in = new FileReader("c:\\windows\\system.ini");
			
			int c;
			while((c = in.read()) != -1){
				System.out.print((char)c);
			}
			in.close();
		}catch(FileNotFoundException e){
			System.err.println("������ �߰����� ���߽��ϴ�.");
		}catch(IOException e){
			System.err.println("����� ����");
		}catch(Exception e){
			System.err.println("���ܰ� �߻��߽��ϴ�.");
		}
	}

}

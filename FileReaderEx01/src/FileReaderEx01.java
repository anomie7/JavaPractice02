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
			System.err.println("파일을 발견하지 못했습니다.");
		}catch(IOException e){
			System.err.println("입출력 오류");
		}catch(Exception e){
			System.err.println("예외가 발생했습니다.");
		}
	}

}

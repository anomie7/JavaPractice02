import java.io.*;
public class test {
	public static void main(String[] args){
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("c:\\tmp\\test.txt");
			int c;
			for(int i = 0; i < 5; i++){
				c = fin.read();
				if(c != -1){
					System.out.print((char)c + " ");
				}
			}
			System.out.println(fin.available());
			fin.close();
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� �� �����ϴ�.");
		}catch(IOException e){
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	}
}

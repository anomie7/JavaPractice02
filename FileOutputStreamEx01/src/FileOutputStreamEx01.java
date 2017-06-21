import java.io.*;
public class FileOutputStreamEx01 {
	public static void main(String[] args){
			try {
				FileOutputStream fout = new FileOutputStream("c:\\tmp\\test.out");
				FileInputStream fin = null;
				for(int i =0; i<10; i++){
					int n = 10-i;
					fout.write(n);
					}
				fout.close();
				fin = new FileInputStream("c:\\tmp\\test.out");
				
				int c = 0;
				while((c = fin.read()) != -1){
					System.out.println(c + " ");
				}
				fin.close();
			} catch (IOException e) {
				System.out.println("입출력 오류");
			}
		}
	}

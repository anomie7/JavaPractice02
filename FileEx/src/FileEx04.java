import java.io.*;
import java.util.Scanner;

public class FileEx04 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		FileReader in = null;
		FileWriter out = null;
		File[] farr = { new File( stdIn.next() + ".txt"), new File(stdIn.next() + ".txt") };
		
		try {
			in = new FileReader(farr[0]);
			out = new FileWriter("2.txt", true);
			
			int c;
			while((c = in.read()) != -1){
				out.write(c);
			}
			in.close(); 
			
			in = new FileReader(farr[1]);
			while((c = in.read()) != -1){
				out.write(c);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
		}catch(IOException e){
			System.out.println("����� ����");
		}
		
		
	}
}

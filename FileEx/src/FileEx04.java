import java.io.*;
import java.util.Scanner;

public class FileEx04 {
	public static void main(String[] args){
		InputStreamReader in1 = new InputStreamReader(System.in);
		File[] farr = new File[2];
		
		for(int i = 0; i < farr.length; i++){
			farr[i] = new File(i + ".txt");
		}
		
		FileWriter fout = null;
		FileWriter fout2 = null;
		try {
			int c;
			fout = new FileWriter(farr[0]);
			while( (c = in1.read() ) != -1){
				fout.write(c);
			}
			
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int c;
		InputStreamReader in2 = new InputStreamReader(System.in);
		try {
			fout2 = new FileWriter(farr[1]);
			while( (c = in2.read() ) != -1){
				fout2.write(c);
			}
			fout2.close();
			in2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		InputStreamReader in = new InputStreamReader(System.in);
//		
//		FileWriter fout = null;
//		int c;
//		try {
//			fout = new FileWriter("c:\\tmp\\a.txt");
//			while((c = in.read()) != -1){
//				fout.write(c);
//			}
//			in.close();
//			fout.close();
//		} catch (IOException e) {
//			// TODO: handle exception
//		}
		
		
	}
}

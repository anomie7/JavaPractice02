import java.io.*;
public class BinaryCopy {
	public static void main(String[] args){
		File src = new File("C:\\test//fight_song.mp4");
		File dst = new File("c:\\tmp\\fight_song.mp4");
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		
		try{
			fi = new FileInputStream(src);
			fo = new FileOutputStream(dst);
			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo);
			while((c = in.read()) != -1){
				out.write(c);
			}
			in.close();
			out.close();
			fi.close();
			fo.close();
			System.out.println("파일 복사 완료");
		}catch(IOException e){
			System.out.println("파일 복사 오류");
		}
	}

}

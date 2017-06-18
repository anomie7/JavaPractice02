import java.io.File;

public class FileEx01 {
	public static void main(String[] args){
		File f1 = new File("출석부");
		File f2 = new File("출석부.jpg");
		System.out.println(f1.length());
		f1.renameTo(f2);	
	}
}

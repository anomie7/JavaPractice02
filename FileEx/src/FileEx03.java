import java.io.*;

public class FileEx03 {
	public static void main(String[] args){
		File f1 = new File("c:\\");
		String[] flist = f1.list();
		
		for(int i = 0; i < flist.length; i++){
			File tmp = new File(f1, flist[i]);
			if(tmp.isDirectory()){
				System.out.println(tmp.getName());
			}
		}
	}

}

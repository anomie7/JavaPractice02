import java.io.*;
import java.util.Scanner;

public class FileEx05_a {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("파일1의 이름 : ");
		String fname1 = stdIn.next();
		
		System.out.print("파일2의 이름 : ");
		String fname2 = stdIn.next();
		stdIn.close();
		
		try {
			BufferedInputStream[] in = { new BufferedInputStream(new FileInputStream(fname1)),
										new BufferedInputStream(new FileInputStream(fname2)) };
			
			if(compare(in[0], in[1])){
				System.out.println("파일이 같습니다.");
			}else{
				System.out.println("파일이 다릅니다.");
			}
			
			if(in[0] != null) in[0].close();
			if(in[1] != null) in[1].close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static boolean compare(BufferedInputStream b1, BufferedInputStream b2) throws IOException {
		// TODO Auto-generated method stub
		int cmp1 = 0, cmp2;
		byte[] i = new byte[100];
		byte[] j = new byte[100];
		
		while(cmp1 != -1){
			cmp1 = b1.read(i, 0, i.length);
			cmp2 = b2.read(j, 0, j.length);
			if(cmp1 != cmp2){
				return false;
			}
			
			for(int k = 0; k < cmp1; k++){
				if(i[k] != j[k]){
					return false;
				}
			}
		}
		return true;
	}

}

import java.io.*;
import java.util.*;
public class FileEx05_b {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		TreeMap<String, String> store = new TreeMap<String, String>();
		
		System.out.print("����1 : ");
		File file1 = new File(stdIn.next());
		
		System.out.print("����2 : ");
		File file2 = new File(stdIn.next());
		
		stdIn.close();
		
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file1));
			
			while(true){
				String str = bf.readLine();
				if(str == null) break;
				store.put(str, str);
			}
			
			bf = new BufferedReader(new FileReader(file2));
			
			boolean isEqual = true;
			while(true){
				String str = bf.readLine();
				if(str == null) {
					break;
				}
				
				String tmp = store.get(str);
				if(tmp == null) {
					isEqual = false;
					System.out.println("�ٸ� �����Դϴ�.");
					break;
				}
			}
			if(isEqual){
				System.out.println("���� �����Դϴ�.");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("������ ã�� ���߽��ϴ�.");
		}catch (IOException e){
			System.err.print("����� ����");
			
		}
	}
}

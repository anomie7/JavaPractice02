package genericEx;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Phone{
	private String name;
	private String add;
	private String number;
	
	public Phone(String name){
		this.name = name;
	}
	public Phone(String name, String add){
		this(name);
		this.add = add;
	}
	public Phone(String name, String add, String number){
		this(name, add);
		this.number = number;
	}
	public String getName(){
		return name;
	}
	public String getAdd(){
		return add;
	}
	public String getNo(){
		return number;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAdd(String add){
		this.add = add;
	}
	public void setNo(String number){
		this.number = number;
	}
	public void setAll(String name, String add, String number){
		this.name = name;
		this.add = add;
		this.number = number;
	}
	public String toString(){
		return "�̸�: " + name + "\n" + "�ּ� : " + add + "\n" + "��ȭ��ȣ : " + number;
	}
	
}

public class Oc07 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		HashMap<String, Phone> h = new HashMap<String, Phone>();
		while(true){
			System.out.println("(0)---���� (1)---���� (2)---�˻� (3)---��ü���� (4)---���� (5)---����");
			int sel = stdIn.nextInt();
			if(sel == 0){
				String key = stdIn.next();
				Phone tmp = new Phone(key, stdIn.next(), stdIn.next());
				h.put(key, tmp);
				
				try {
					FileWriter fout = new FileWriter("c:\\tmp\\phone.txt", true);
					fout.write(h.get(key).toString());
					fout.close();
				} catch (IOException e) {
					System.out.println("����� ���� �߻�");
				}
			}else if(sel == 1){
				String key = stdIn.next();
				h.remove(key);
			}else if(sel == 2){
				String key = stdIn.next();
				System.out.println(h.get(key));
			}else if(sel == 3){
				Set<String> keys = h.keySet();
				Iterator<String> itr = keys.iterator();
				while(itr.hasNext()){
					String key = itr.next();
					System.out.println(h.get(key));
				}
			}else if(sel == 4){
				//setAll ȣ��.
				String key = stdIn.next();
				h.get(key).setAll(key, stdIn.next(), stdIn.next());
				System.out.println(h.get(key));
			}else if(sel == 5){
				break;
			}
			System.out.println("��ȭ��ȣ�� ���α׷��� ����Ǿ����ϴ�.");
		}
		stdIn.close();
	
	}
}

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	public static void printList(LinkedList<String> list){
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else 
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args){
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");
		myList.add("����Ǯ");
		myList.add("�������");
		myList.add("�����̴���");
		myList.add("���Ҽ�");
		myList.add("�丣");
		myList.add("����Ƽ�� ����");
		myList.add("��Ʈ��");
//		myList.add("��ũ");
		
		printList(myList);
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") + 1; 
		System.out.println("�ƹ�Ÿ�� " + index + "��° ����Դϴ�.");
	}

}

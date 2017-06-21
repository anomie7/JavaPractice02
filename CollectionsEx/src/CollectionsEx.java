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
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		myList.add("데드풀");
		myList.add("원더우먼");
		myList.add("스파이더맨");
		myList.add("블랙팬서");
		myList.add("토르");
		myList.add("저스티스 리그");
		myList.add("앤트맨");
//		myList.add("헐크");
		
		printList(myList);
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타") + 1; 
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}

}

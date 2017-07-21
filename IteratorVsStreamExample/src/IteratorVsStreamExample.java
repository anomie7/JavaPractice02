import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		Stream<String> stream = list.stream();
		stream.forEach(a -> System.out.print(a + " "));
	}
}

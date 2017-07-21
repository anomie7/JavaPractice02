import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "���ٽ�", "�ں���");
		
		Stream<String> stream = list.stream();
		stream.forEach(ParalleExample :: print);
		
		System.out.println();
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParalleExample::print);
		
	}
	
	public static void print(String str){
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}

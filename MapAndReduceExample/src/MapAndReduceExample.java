import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("ȫ�浿", 10), new Student("�ſ��", 20), new Student("���̼�", 30) );
		
		double avg = studentList.stream().mapToInt(Student::getScore).average().getAsDouble();
		
		System.out.println("��� ����: " + avg);
	}
}

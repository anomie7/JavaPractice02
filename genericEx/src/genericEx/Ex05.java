package genericEx;
import java.util.*;
class Student{
	private String name;
	private String major;
	private int sno;
	private double scoreAvr;
	
	public Student(String name, String major, int sno, double scoreAvr){
		this.name = name;
		this.major = major;
		this.sno = sno;
		this.scoreAvr = scoreAvr;
	}
	public String toString(){
		return String.format("�̸� : %s\n �а�: %s\n �й�: %d\n �������: %1.1f\n", 
							 name, major, sno, scoreAvr);
	}
}

public class Ex05 {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	Student[] st = new Student[5];
	ArrayList<Student> a = new ArrayList<Student>();
	
	for(int i = 0; i < 1; i++){
		st[i] = new Student(stdIn.next(), stdIn.next(), stdIn.nextInt(), stdIn.nextDouble());
		a.add(st[i]);
	}
	stdIn.close();
	
	Iterator<Student> it = a.iterator();
	
	while(it.hasNext()){
		Student obj = it.next();
		System.out.println(obj);
	}
	}
}

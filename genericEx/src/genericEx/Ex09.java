package genericEx;
import java.util.*;
class Student01{
	private String name;
	private String major;
	String sno;
	private double scoreAvr;
	
	public Student01(String name, String major, String sno, double scoreAvr){
		this.name = name;
		this.major = major;
		this.sno = sno;
		this.scoreAvr = scoreAvr;
	}
	public String toString(){
		return String.format("이름 : %s\n 학과: %s\n 학번: %s\n 학점평균: %1.1f\n", 
							 name, major, sno, scoreAvr);
	}
}

public class Ex09 {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	Student01[] st = new Student01[2];
	HashMap<String, Student01> dept = new HashMap<String, Student01>();
	for(int i = 0; i < st.length; i++){
		st[i] = new Student01(stdIn.next(), stdIn.next(), stdIn.next(), stdIn.nextDouble());
		dept.put(st[i].sno, st[i]);
	}
	stdIn.close();
	
	Set<String> keys = dept.keySet();
	Iterator<String> itr = keys.iterator();
	while(itr.hasNext()){
		System.out.println(dept.get(itr.next()));
	}
	
	}
}

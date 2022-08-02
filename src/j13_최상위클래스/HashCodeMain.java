package j13_최상위클래스;

import java.util.Objects;

public class HashCodeMain {

	public static void main(String[] args) {
		Student student = new Student(20220001, "김준일"); 	// 값으로만 코드를 생성하는 hash 를 만들어주엇읍니다. 
		Student student1 = new Student(20220001, "김준일");
		Student student2 = new Student(20220002, "김준일");
		
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println(student.hashCode() == student1.hashCode());
		System.out.println(Objects.hash(20220001,"김준일"));
	}

}

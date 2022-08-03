package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("java");	// 중복값은 하나만 출력됨. 
		set.add("java3");	// 딱히 순서대로 나오는 건 아님. hash 기준으로 나옴. 
		set.add("java2");
		set.add("1");
		set.add("2");
		
		System.out.println(set);	// 값의 중복을 허용하지 않고 순서 없음 
		
		// set 은 인덱스 순서가 없어서 get() 쓸 수 없음. 
		Iterator<String> ir = set.iterator();	// 아이터레이터를 대신 씀. 
		
		// has next / 다 줄을 세워서 그다음 사람 있으면 true를 출력함.
		// next / 그 사람 누구임?
		
//		System.out.println(ir.hasNext()); 	 
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
		
		System.out.println("------------------------");
		while(ir.hasNext()) {
			String str = ir.next();
			if (str.equals("java")) {
				System.out.println(str);
			}
		}
		
		/*
		 * 학생 set을 만들고
		 * 학생 이름이 서재효인 객체를 찾아서 
		 * 출력하고 삭제
		 */
		
		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
		
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		studentSet.add(student4);
		studentSet.add(student5);
		
		System.out.println(studentSet);
		
		Iterator<Student> ir2 = studentSet.iterator();
		while(ir2.hasNext()) {
			Student student = ir2.next();
			if(student.getName().equals("서재효")) {
				System.out.println(student);
				studentSet.remove(student);
				break;
			}
		}
		
		System.out.println(studentSet);
		
	}
}

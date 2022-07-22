package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setName("김준일"); // 새터에 이름 넣어달라고 요청하는 것임

		System.out.println(s1.getName());
		
	}

}

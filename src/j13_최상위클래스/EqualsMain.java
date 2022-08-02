package j13_최상위클래스;

public class EqualsMain {

	public static void main(String[] args) {
		Student s1 = new Student(20220001, "김준일");
		Student s2 = new Student(20220001, "김준일");
		Student s3 = new Student(20220002, "김준이");
		Student s4 = new Student(20220002, "김준일");
		
		System.out.println(s1 == s2);		// 주소가 다름. 
		System.out.println(s1.equals(s2));  // 이것도 주소 비교임. TRUE가 나오게 하려면 equals를 재정의해줘야 하는 것임. 
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.getClass() == s2.getClass());
		System.out.println(s1 instanceof Student);			// 해당 클래스가 동일한 객체인지 확인하는 것임. XX
		System.out.println(s1.getClass() == Student.class); // 이걸로 써주는게 좋습니다. OO
		
		System.out.println(s2.getClass());
		System.out.println(s3.getClass());
	}

}

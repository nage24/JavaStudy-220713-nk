package j09_클래스.접근지정자.student;

public class Student {
	private String name;
	private int studentYear;
	private int age;
	private String address;
	private String phone;
	// 일단 모든 변수들은 private
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}	
	
	// private 변수에 값을 주입하는 방법 1
	// 생성자를 통한 값 주입					// 생성자 오버로딩 시 기본생성자 비활성화 되므로 위에 만들어줘야합니다. 
	
	public Student(String name, int studentYear, int age, String address, String phone) {
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.address = address;
		this.phone = phone;
		
	}
	
	// private 변수에 값을 주입하는 방법 1
	// [ Setter를 통한 값 주입 ]
	
	public void setName(String name) {
		this.name = name;
	}
	
	// private 변수의 값을 가져오는 방법
	
	public String getName() {
		return name;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 알트 쉬프트 에스 로 게터세터도 만들수 있답니다. 

	
}

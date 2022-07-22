package j09_클래스.생성자;

public class ConstructorEx {
	
	String name; // 이 네임과
	int age;
	//Args -> Argument (인수, 매개변수)
	
	//NoArgsConstructor
	public ConstructorEx() {
		System.out.println("기본 생성자");
	}
	
	//Required(필수) 
	//RequireArgsConstructor
	public ConstructorEx(String name) {	//오버로딩가능
		System.out.println("매개변수: " + name); // -> 얘는 매개변수의 네임입니다. 
		System.out.println("name을 매개변수로 받는 생성자");
		this.name = name; // 이 생성자 안의 네임(매개변수로 받은 네임)과 이 전체 클라스 네임은 다릅니다 ...
		//우리가 보고있는 틀 에도 name이 있고 메소드 안에 매개변수 name이 있다고 치면, 둘은 다릅니다. 
		//구분을 해줄 때 우리주소(우리 클래스 틀의) name을 this.을 찍어서 표시를 해주는 겁니다. 
	}
	// 매개변수 name에 매개변수 name을 넣을 수가 읍죠... 변수명이 같으니까요
	
	//RequireArgsConstructor
	public ConstructorEx(int age) {	//오버로딩가능
		System.out.println("매개변수: " + age);
		System.out.println("age를 매개변수로 받는 생성자");
	}
	
	//AllArgsConstructor
	public ConstructorEx(String name, int age) {	// 전체 생성자
		System.out.println("매개변수: " + name);
		System.out.println("매개변수: " + age);
		System.out.println("전체 생성자");
	}
	
}

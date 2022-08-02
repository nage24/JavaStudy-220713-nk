package j15_스태틱;

import lombok.ToString;

@ToString
public class Student {
	
	public static int autoCode = 20220000;	// 공유하는 영역 static의 주 용도는 공유!
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = ++autoCode;
		this.name = name;
	}
}

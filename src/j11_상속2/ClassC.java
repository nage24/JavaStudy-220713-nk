package j11_상속2;

public class ClassC extends ClassA {
	
	public ClassC() {
		super();
		System.out.println("두번째(C) 자식 클래스 생성자 호출");
		System.out.println();
	}

	@Override
	public void showInfo() {
		System.out.println("저는 활을 만들었어욤");
		
	}
}

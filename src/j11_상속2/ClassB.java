package j11_상속2;

public class ClassB extends ClassA {

	public ClassB() {
		super();
		System.out.println("첫번째(B) 자식 클래스 생성자 호출");
		// 알트 쉬프트 에이 하니까 커서가 바뀌어용
		super.printInfo();
		System.out.println();
	}
	
	@Override
	public void printInfo() {
		System.out.print("첫번째(B) 자식");
		super.printInfo();
	}

	@Override
	public void showInfo() {
		System.out.println("총만들었어욤");
	}
}

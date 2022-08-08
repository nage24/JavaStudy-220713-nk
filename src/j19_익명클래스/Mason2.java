package j19_익명클래스;

public class Mason2 {

	public static void main(String[] args) {
		AbstractTest abstractTest = new AbstractTestImpl();
		abstractTest.showData("Mason");
		
		// 익명 클래스는 그 메인 안에서만 쓸수있음
		// 거기 있는걸 쓰겠다 하면 그 클래스 생성자에서 메소드 만들어서 꺼내줘야 하는 것임. 
		// 그래서 거기서만 사용하는 일회용일 때 쓰게 된다 .. 
		// 

	}

}

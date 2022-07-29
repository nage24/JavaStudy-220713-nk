package j11_상속2;

public class ClassTestMain {

	public static void main(String[] args) {
		// ClassA a = new ClassA(); // 추상 클래스 얘만 생성 안됨 .
		ClassB b = new ClassB();
		ClassC c = new ClassC();		// 주소값임.
		
		b.showInfo();
		c.showInfo();
		
		((ClassA) new ClassB()).showInfo(); // 업캐스팅 할라면 괄호로 쫙 묵어줘야해용
		
		ClassB bb = new ClassB();
		((ClassA) bb).showInfo();
	}

}

package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		
		Human human = new Human();
		
		Tiger tiger = new Tiger(); 	// Animal에 있는 메소드를 상속받은 얘로도 쓸수가 있다. 
		
		// 두 객체의 부모 객체는 각자입니다! (그래서 오버라이드 할  수 있는것임)
		
		human.move(); // 재정의(오버라이딩)하게 되면 메소드가 자식클래스 내부의 것이 됨. 
		human.readBooks();
		tiger.move();

	}

}

package j12_다형성.추상;

public class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");		// 추상클래스와 추상메소드를 상속받은 클래스에서는
														// 그 추상 메소드를 꼭꼭꼭 사용해야 만들수있음 
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

package j12_다형성.추상;

public class AnimalMain {

	public static void main(String[] args) {
		// Animal animal = new animal(); 			// 추상 클래스는 생성할수 없음. 추상 메소드가 완전하게 지정되어 있지 않기 때문에 ... 
		// 일반 클래스로 머시기 해줘야만 생성가능
		
		Animal animal = new Human();
		
	}

}

package j11_상속;

public class Human extends Animal {	// 컨트롤 스페이스로 extends(상속), 복사되었다 고 생각하믄 대용
	
	public Human() {
		// super(); 					// 자식클래스는 얘가 생략되어져 있다. -> 부모클래스의 생성자를 가져오는 메소드 
		// HUMAN 객체에서 super은 늘 우선적으로 위치해야댄다. 자식있고 부모있는게 아니지요? 
		System.out.println("휴먼 객체 생성");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	@Override 	//오버라이드 : 재정의 , @ -> 이노테이션 이라 할 겁니다. 
	public void move() {
		// super.move();		// 부모 클래스의 move메소드를 불러온거임
		System.out.println("사람이 두발로 drje습니다.");			// 근데 얘는 머 오버라이딩 말고 걍 함수 새로 선언해도 똑같겠죠
	}
	
	
}

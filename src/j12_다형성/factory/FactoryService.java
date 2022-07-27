package j12_다형성.factory;

import j11_상속.factory.Factory;

public class FactoryService {			// 얘네는 프레임 코드라고 해서 최대한 유동적으로 받을 수 있게 만들어주는 게 중요해요. 

	private Factory factory; 	// 삼성 엘지도 가능. 업캐스팅이 되니깐. 

	public FactoryService(Factory factory) {
		this.factory = factory;
	}
	
	public void factoryStart() {
		factory.start();
	}
	
	public void factoryStop() {
		factory.stop();
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}		// 세터로 밖에서 값을 바꿔 줄 수 있다. 
	
	// 모든 객체지향 프로그래밍은 결합도가 낮을 수록 좋다.
	// 
	// 프레임 만의 기능과 바퀴 만의 기능이 있음. 
	// 프레임에서 쓰는 함수는 바퀴 안에 선언해두면 전혀 다른 ... 거죠 메소드 같은 걸 잘 모아두는 게 잘 응집되어졌다고 함. 
	// 응집도가 높아야 좋은 프로그램 
	
	// 서로 그것일 수 있는 것은 상속 관계  : 공장과 삼성공장
	// HDMI와 모니터 는 전혀 관계가 엇음 다른 기능임 그것을 우리는 인터페이스로 만들거다 ...
	// 기능을 구현하는 관계는 인터페이스 ... 
	
	// D I 디펜던시(종속; 의존성) 인덱션(주입)
	// 원래 의존되어 있어야 할 대상을 분리? 하는게 DI 방식이라 하는 것임. 
	// 연결되어 있는 대상을 떼어내서 외부에서ㅜ터 주입을 시키겠다. . . 
	
	// 구조를잘 모르겠네 
	
	// 
	
}

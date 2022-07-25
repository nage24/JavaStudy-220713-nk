package j11_상속.factory;

public class FactoryMain2 {

	public static void main(String[] args) {
		 // 업캐스팅 
		// 부모 객체 형태로 형변환 하는 것을 말합니다. 
		
		Factory factory1 = new SamsungFactory(1);		// 삼성 팩토리 클래스 자료형에만ㅇ 들어갈 수있었느데
														// 상속 하면 부모 자료형에도 대입을 할 수 있습니다. 
														// 근데 업캐스팅 하면 부모 개체에 있는 함수만 쓸 수가 있습니다. 
		Factory factory2 = new LGfactory(1);			
														// 같은 자료형은 배열로 묶을 수 있어요
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGfactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGfactory(2);
		
		System.out.println("모든 공장을 가동합니다. ");
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();						// 각각에 맞는 오버라이딩 되어진것이 실행이 된다 ... 근데 부모가 가진것만 호출할 수가 있다. 
														// 왜냐면 아부지 형태로 변환이 되어져있기 대문에 ... 근데 바꾼 속성은 이미 적용이 된 것임. 복잡하네요
		}
		
		System.out.println("모든 공장을 중지합니다. ");
		for(int i = 0; i < factories.length; i++) {
			factories[i].stop();
		}
		
		
	}

}

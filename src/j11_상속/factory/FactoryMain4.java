package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		//업캐스팅
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGfactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGfactory(2);
		
		//다운캐스팅
		
		// instanceof; 객체의 원래 형태를 비교
		System.out.println(factories[0] instanceof SamsungFactory); 	// 저 배열 0번째 저 객체가 원래 삼성팩토리였음? 맞으면 true 틀리면 false를 출력함. 
		
		System.out.println(factories[0] instanceof LGfactory);
		
		for(int i = 0; i < factories.length; i++) {
			
			if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory) factories[i];
				samsungFactory.produceSmartPhone();
				
			}else if(factories[i] instanceof LGfactory) {
				LGfactory lgFactory = (LGfactory) factories[i];
				lgFactory.produceSmartTv();
				
			}else {
				System.out.println("형변환 불가");
			}
			
		}
		
		
	}

}

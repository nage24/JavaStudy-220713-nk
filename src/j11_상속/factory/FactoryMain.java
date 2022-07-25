package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory[] samsungFactories = new SamsungFactory[3]; // 1공장 이라고 번호를 넣어주면 통해 통해서 실행이 되는 겁니다. 
		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);
		
		LGfactory[] LGfactories = new LGfactory[3];
		LGfactories[0] = new LGfactory(1);
		LGfactories[1] = new LGfactory(2);
		LGfactories[2] = new LGfactory(3);
		
		
		System.out.println("삼성 공장 가동");
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].start();
		}
		
		System.out.println("삼성 공장 중지");
		for(int i = 0; i < samsungFactories.length; i++) {
		
			samsungFactories[i].stop();
		}
		
		
		System.out.println("LG 공장 가동");
		for(int i = 0; i < LGfactories.length; i++) {
			LGfactories[i].start();
		}
		
		System.out.println("LG 공장 중지");
		for(int i = 0; i < LGfactories.length; i++) {
			LGfactories[i].stop();
		}
		
		
		
	}

}

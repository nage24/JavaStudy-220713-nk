package j11_상속.factory;

public class FactoryMainEx {
	

	public static void main(String[] args) {
		
		/*
		 * Factory Array 20
		 * 
		 * 배열의 인덱스가 
		 * 짝수이면 삼성팩토리 생성해서 대입
		 * 홀수이면 엘지팩토리 생성해서 대입
		 * 
		 * 근데 이름은 
		 * 삼성공장이 1~10
		 * 엘지공장이 1~10 이 되도록한다. 
		 * 
		 * 모든 공장 가동
		 * 모든 공장 생산
		 * 모든 공장 중지 를 한번에 나오게
		 * 
		 */
		
		Factory[] factories = new Factory[20];
		
		for(int i = 0; i < factories.length; i++) {
			
			if(i % 2 == 0) {						// 짝수일 때는 삼성 팩토리 만들기 0 2 4
				factories[i] = new SamsungFactory(i/2 + 1);		// 삼성 공장 1~ 10 공장이 되도록 하려면 ... 1 3 5 7 9 11 13 15 17 19
				SamsungFactory samsungFactory = (SamsungFactory) factories[i];	// 다운캐스팅
				samsungFactory.start();
				samsungFactory.produceSmartPhone();
				samsungFactory.stop();
				System.out.println();
			}else {									// 홀수일 대는 엘지 팩토리 만들기 1 3 5 
				factories[i] = new LGfactory(i/2 + 1);			// 엘지 공장 2 4 6 8 10 12 14 16 18 20 -? 1 2 3 4 ... 10
				LGfactory lgFactory = (LGfactory) factories[i];
				lgFactory.start();
				lgFactory.produceSmartTv();
				lgFactory.stop();
				System.out.println();
			}
			
			
		}
		

	}

}

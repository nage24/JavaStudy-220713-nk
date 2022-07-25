package j11_상속.factory;

public class LGfactory extends Factory {

	public LGfactory(int factoryNumber) {
		super(factoryNumber);
	}
	
	public void produceSmartTv() {
		System.out.println("LG 스마트 Tv를 생산합니다.");
	}
	
 // 컨트롤 스페이스 오버라이드 검색
	@Override
	public void start() {
		System.out.print("LG ");
		super.start();
	}
}

package j11_상속.factory;

public class SamsungFactory extends Factory {

	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	}
	
	
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 생산합니다.");
	}
	
	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start();
	}
}

package j11_상속.factory;

public class Factory {
	private int factoryNumber;
	
	public Factory(int factoryNumber) {		// super()로 자식클래스에 상속이 되어있다
		this.factoryNumber = factoryNumber;
	}
	
	public void start() {
		System.out.println(factoryNumber + "공장을 가동합니다.");
	}
	
	public void stop() {
		System.out.println(factoryNumber + "공장을 멈춥니다.");
	}
	
}

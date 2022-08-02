package j14_lombok;

public abstract class CarBuilder {
	
	protected Car car;		// 같은 패키지 내에서는 호출 가능.
	
	public Car build() {
		return car;
	}
	
	public CarBuilder builder() {
		car = new Car();
		return this;
	}
	
	public abstract CarBuilder company(String company);
	public abstract CarBuilder model(String model);
	public abstract CarBuilder color(String color);
	

}

package j15_스태틱.싱글톤;

/*
 * 싱글톤(Singleton)
 * 유일한 객체를 만들어서 공유하는 생성방법
 * 
 * 1. 생성자는 접근지정자가 private이다. // 외부에서 호출할 수 없음. 
 * 안에서 static으로 자기 자신의 객체를 만든다. 
 * 만약 값이 없을 때 하나 생성하고
 * 있으면 그 있는 값을 내놔라. 
 * 2. 자기 자신의 유일한 객체를 담을 수 있는 instance라는 변수명을 가진 스태틱 변수가 필요하다. 
 * 3. instance 변수를 리턴(공유)해줄 getInstance 스태틱 메소드가 필요하다. 
 */

public class KIA {
	private static KIA instance;
	
	private Car[] carArray;
	private int autoCode;
	
	private KIA() {
		carArray = new Car[10];		// 주차공간이 10개 밖에 없다는 의미 같은 것임. 2군데 주차공간이 잇느게 아니니까 . 
		autoCode=20220000;
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car produceCar(String model) {
		int carNumber = ++autoCode;
		String company = getClass().getSimpleName();
		
		// Car car = new Car(carNumber, company, model);\
		Car car = Car.builder()
				.carNumber(carNumber)
				.Company(company)
				.model(model)
				.build();
		
		
		if(addCar(car)) {
			return car;
		}
		return null;
	}
	
	private boolean addCar(Car car) {
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				carArray[i] = car;
				System.out.println("배열에 차량 추가 완료");
				return true;
			}
		}
		System.out.println("배열에 공간이 없습니다.");
		return false;
	}

}

// 이 기아 객체는 유일하기 때문에 다른 CAr 배열 멤버나 다른 일반 멤버가 생겨도 전부!!! 유일한 값임.  왜? 객체가 하나밖에 없으니 든 값도 하나 .

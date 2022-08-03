package j14_lombok;

public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Car car = builder.builder()		// CarBuilder 에서 차 설정같은 걸 전부 set 할 수 있게 만들어 뒀었음. 
			.company("기아")
			.model("k5")
			.color("화이트")				// 그 메소드들을 써서 차가 이런거다~ 라는걸
			.build();					// set 해두고 build 해서 객체가 만들어짐. 
		
		System.out.println(car);
		
		
		// builder 패턴 말고 기존 방식
//		Car car2 = new Car();
//		car2.setCompany("현대");
//		car2.setModel("동가링");
//		car2.setColor("깜장");
//		System.out.println(car2);
		
		// 이 방식으로 하면 빈 주소를 만들고 값을 넣어줘야 하지만, 
		// 빌드 패턴을 사용하면 무조건 값을 넣고 온전하게 만들어줄 수 있다. 
	}

}

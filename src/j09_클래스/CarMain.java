package j09_클래스;

/*
 * 클래스: Car
 * 변수
 * 		company
 * 		model
 * 		color
 * 
 * 메소드
 * 		showCarInfo()
 * 				회사명: 000
 * 				모델명: 000
 * 				색상:  000
 * 
 * 
 * 3대
 * 현대자동차
 * 쏘나타
 * 화이트
 * 
 * 기아
 * k5
 * 블랙
 * 
 * 현대자동차
 * 아반떼
 * 그레이
 * 
 */

public class CarMain {

	public static void main(String[] args) {
		
		System.out.println((new Car()).toString()); // -> 생성자는 무조건 주소값을 리턴.
		//프린트 할 때만 toString이고 주소값은 string 변수에 넣을 수 업읍니다 걍 주소값 이니 자료형 안쓰면 댑니다. 
		Car car1 = new Car(); // 무조건 주소값 리턴하기 때문에 굳이 자료형을 쓰지 않는 것임. 
		Car car2 = new Car(); // 다른 메소드들과 다른 이유입니다. 
		Car car3 = new Car(); // 또 무조건 생성자는 클래스와 이름이 같아야! 합니다. (대문자)
		
		car1.company = "현대자동차";
		car1.model = "쏘나타";
		car1.color = "화이트";
		car1.showCarInfo();
		
		car2.company = "기아";
		car2.model = "k5";
		car2.color = "블루";
		car2.showCarInfo(); // --> 얘네 함수 보면 void로 지정되어 있어서 변수에 넣거나 할순 없음
		
		car3.company = "현대";
		car3.model = "아반떼";
		car3.color = "그레이";
		car3.showCarInfo();
		

	}

}

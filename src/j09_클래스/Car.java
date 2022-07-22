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


public class Car {
	String company;
	String model;
	String color;
	
	// 생성자는 무조건 주소값을 리턴한다. 
	public Car() {
		System.out.println("생성자 호출?");
	} // 클래스에서 컨트롤 스페이스 하면 constructor가 나오는데, 
	  //이것이 늘 생략되어져 있기 때문에 다른 main클래스에서 얘를 실행할 수 있는 것임
	
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상:  " + color);
		System.out.println();
	}
	
}

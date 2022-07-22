package j09_클래스.생성자;

public class Car {
	
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
	 */
	
	String company;
	String model;
	String color;
	
	public Car() { //오버로딩 시 기본생성자 는 비활성화 되기 때문에 넣어주면 댑니다 . 
		
	}

	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
				
	}
	
			void showCarInfo() {
			System.out.println("회사명: " + company);
			System.out.println("모델명: " + model);
			System.out.println("색상:  " + color);
			System.out.println();
		}	
}

  package j16_제네릭;

import j14_lombok.Builder;
import j14_lombok.Car;

public class CMRespMain {

	public static void main(String[] args) {
		// 자동차를 한대 생성해줘 ~ 
		Builder builder = new Builder();
		Car car = builder.builder()
				.company("현대")
				.model("쏘나타")
				.color("화이트")
				.build();
		
		CMRespDto<Car> cmRespDto = new CMRespDto<Car>(1, "차량 생성 완료", car);
		System.out.println("응답결과: " + cmRespDto);
		
		CMRespDto<?> cmRespDto2 = null; // 와일드카드 <?> 해당 제네릭 타입에 뭐가 들어올지 모르겠다. 뭐든 들어와도 된다는 의미. 
		
		// 해당 차량이 현대 자동차인지 확인해줘
		if(car.getCompany().equals("현대")) {
			cmRespDto2 = new CMRespDto<>(1, "현대자동차 맞음", car);
		}else {
			cmRespDto2 = new CMRespDto<>(-1, "현대자동차 아님", false);
		}
		
		System.out.println("응답결과: " + cmRespDto2);
	}
	
	

}

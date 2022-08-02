package j15_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Car {

	private int carNumber;
	private String Company;
	private String model;
	
}

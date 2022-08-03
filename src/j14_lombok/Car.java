package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Car {
	private String company;
	private String model;
	private String color;
	
	
//	public void setCompany(String company2) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setModel(String model2) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setColor(String color2) {
//		// TODO Auto-generated method stub
//		
//	}
}

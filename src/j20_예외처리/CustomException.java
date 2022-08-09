package j20_예외처리;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	
	public CustomException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("우리가 만든 예외");
		return 
	}
	
}

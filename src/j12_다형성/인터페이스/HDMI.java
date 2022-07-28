package j12_다형성.인터페이스;

/* 
 * 인터페이스 특징
 * 1. 모든 메소드는 기본적으로 추상 메소드로 정의한다. 
 * 2. 생성을 할 수 없다. 
 * 3. 일반 변수는 선언할 수 없다. 
 * 4. 무조건 스태틱 상수를 사용한다. 
 * 5. 일반 메소드를 정의하기 위해서는 반환 자료형 앞에 default를 입력해야 한다. 
 * 6. 인터페이스는 다중 구현이 가능하다.  
 */

public interface HDMI extends ConnectionTerminal {		// 인터페이스와 인터페이스 끼리는 상속이 됨. 
	// 인터페이스를 클래스에서 사용할 때는  implements(구현)
	
	// public int number = 10; 	// 상수 static변수가 살짝 기울어져 있음
								// static 이랑 final도 안적어줘도 알아서 스태틱 상수가 됨. 
	
	public String VERSION = "2.0";
	
	public void soundOutput();
	
	
}

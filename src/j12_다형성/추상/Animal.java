package j12_다형성.추상;

	/*
	 * 추상 메소드가 하나라도 포함되어 있는 클래스는
	 * 추상 클래스로 정의해야 한다. 
	 * 
	 */

public abstract class Animal {
	
	// public void move() {}
	// 어차피 공통으로 묶어줄 용도이기 때문에 내용이 없어도 상관이 없어요 근데 이거조차 쓰고싶지 않은 ,,,
	
	public abstract void move(); 		// 추상 메소드, '설계도'같은 개념입니다. 
										// 틀을 만들기 위한 설계도
	
	
}

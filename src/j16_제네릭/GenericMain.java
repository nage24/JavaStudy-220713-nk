package j16_제네릭;

import j14_lombok.Car;

public class GenericMain {
	public static void main(String[] args) {
		GenericTest<Integer, String> genericTest = new GenericTest<Integer, String>();	// 생성되는 시점에 파라미터의 자료형을 설정해줄 수 있는 것임 
		GenericTest<String, Car> genericTest2 = new GenericTest<String, Car>();	// int 입력 못하고 Integer 라고 써줘야함
		
		genericTest.setKey(100);
		genericTest.setValue("원");
		
		
		System.out.println(genericTest.equals(genericTest2));
		System.out.println(genericTest.getKey() + genericTest.getValue());
	}
}

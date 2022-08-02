package j16_제네릭;

import lombok.Data;

@Data
//public class GenericTest<T> {
//	private int number;
//	private T data;	// T 는 타입(자료형),>>  E 는 엘리먼츠 라는 객체의 의미임 T가 상위임. 
	
	
	public class GenericTest<K, V> {
		private K key;
		private V value;	
	
	
}

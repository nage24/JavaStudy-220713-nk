package j10_배열.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {

	public static void main(String[] args) {
		/*
		 * Arrays 클래스 사용법
		 *  - 배열을 관리해주는 객체
		 *  불러와 줘야 해요
		 *  
		 *  1. 배열의 내용을 검색 후 인덱스를 반환받는 방법
		 *  - binarySearch(찾고자 하는 값)
		 *  
		 *  2. 배열을 복사할 때 사용하는 메소드
		 *  - copyOf(복사하고자 하는 배열, 새로 생성할 배열의 크기)
		 *  
		 *  3. 배열을 복사할 때 원하는 범위만 복사해주는 메소드
		 *  - copyOfRange(복사하고자 하는 배열, 시작 인덱스, 마지막 인덱스)
		 *  
		 *  
		 *  4. 배열을 초기화하고 원하는 값으로 모두 채우는 메소드
		 *  - fill(초기화하고자 하는 배열, 채울 값)
		 *   
		 *  5. 배열을 정렬하는 방법
		 *  - sort(정렬하고자 하는 배열) 
		 *   
		 */
		
		int[] numbers = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
		
		// 얕은 복사라고 합니다. :: 배열의 '주소'만 복사를 한다는 말입니다. 값이 아니고. 
		int[] numbers2 = numbers; 	// numbers2와 numbers는 주소가 같습니다. 
		
		numbers2[0] = 100; // numbers2의 값을 바꾸면 numbers 도 바뀌게 되겠죠 ... 
		
		printArray(numbers);
		printArray(numbers2);
		
		
		
		
		// 깊은 복사
		numbers[0] = 1;
		
		int[] numbers3 = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers3[i] = numbers[i];
		}
		
		numbers3[0] = 500;			// 얘는 얘만 바귀지요 주소가 다르거든
		printArray(numbers3);
		printArray(numbers);
		
		int[] numbers4 = Arrays.copyOf(numbers, numbers.length); 	// 요론 쉬운 방법이 이따~~~
		printArray(numbers4);
		
		int[] numbers5 = Arrays.copyOfRange(numbers, 1, 5); 		// 1열부터 5열 전까지만 배열 만들기
		printArray(numbers5);
		
		Arrays.sort(numbers4);
		printArray(numbers4);	// 오름차순 정렬
		

		
		int num = 10;
		Integer[] numArray = { 1, 2, 3, 4, 5 }; 					// 이러한 자료형만 컬렉션을 쓸수가 있어여
		Arrays.sort(numArray, Collections.reverseOrder()); 			// 컬렉션은 일반 자료형에선 사용할 수 없고요.. 
		printArray(numArray);
		
		
		
		// 배열 초기화 후 채우기
		Arrays.fill(numbers5, 10);
		printArray(numbers5);
		
		
		// 값의 위치 찾기
		Arrays.sort(numbers);
		int index = Arrays.binarySearch(numbers, 5);			// 무족건 정렬한 상태에서 서치해줘야해요
		printArray(numbers);
		System.out.println("찾은 인덱스: " + index);
		
		
		
		
		
	}
	
	
	public static void printArray(int[] arr) { 	// 매개변수는 배열 자료형
		
		System.out.print("Array: [ ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length -1) {			// 마지막이 아니면 ,를 찍어라 ~ 
				System.out.print(", ");
			}
		}
		
		System.out.println(" ]");				// 출력 후 줄바꿈
	}
	
	public static void printArray(Integer[] arr) { 	// 매개변수는 배열 자료형
		
		System.out.print("Array: [ ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length -1) {			// 마지막이 아니면 ,를 찍어라 ~ 
				System.out.print(", ");
			}
		}
		
		System.out.println(" ]");				// 출력 후 줄바꿈
	}

}

package j10_배열;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		/*
		 * 배열 선언과 초기화
		 */
		
		// 정수 배열 
		int[] numbers = new int[5]; // new는 메모리 할당으로 일단 공간할당을 해주는 것임 □□□□□
		
		
		// 문자열 배열 
		String[] strArray = new String[5]; // 기본적으로 null이 들어가있다. 
		
		
		// 객체 배열
		Scanner[] scanArray = new Scanner[5]; // 스캐너를 생성하게 되면 주소가 생기는데 그 주소를 담는 배열이 생기는 것. 
		// 값이 담기는 것이 아님! 객체가 5개가 만들어진 것이 아님 ! 
		// 얘도 기본적으로 null
		
		Scanner s = new Scanner(System.in);
		
		/*
		 * 배열에 값 추가
		 */
		
		numbers[0] = 10; // numbers의 0번째 인덱스
		numbers[1] = 20;
		
		strArray[4] = "마지막문자열";
		
		// null : 안이 텅 ... 비어 있다. 주소가 비었다는 뜻 아무것도 생성되어 있지 않음
		
		scanArray[0] = new Scanner(System.in); // 기본은 null
		
		
		
		
		

	}

}

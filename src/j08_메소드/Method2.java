package j08_메소드;

import java.util.Scanner;

public class Method2 {
	
	/*
	 * 반환자료형, 리턴자료형
	 * 반환값, 리턴값
	 * 메소드명, 함수명
	 * 파라미터, 매개변수
	 * 메소드(함수) 정의
	 * 메소드(함수) 호출(콜)
	 */
	
	// 반환도 없고 매개변수도 없는 메소드
	
	public static void test1() { 				// void 는 비어있다; 즉, 반환값이 없다는 뜻. 
		System.out.println("test1 메소드 호출");
	}
	
	// 반환이 없고 매개변수가 하나이 메소드 
	
	public static void test2(int num) {
		System.out.println("num" + num);
		System.out.println("test2 메소드 호출");
	}
	
	// 반환이 없고 매개변수가 두개인 메소드
	public static void test3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println("test3 메소드 호출");
	}
	
	// 반환은 있고 매개변수가 없는 메소드
	
	public static int test4() {					// 반환 자료형 -> void가 아니고 int라 되어있는 건 돌려줄 때는 int로 준다는것임. 
		System.out.println("test4 메소드 호출");
		return 100;
	}
	
	public static Scanner test4_2() {					// 반환 자료형 -> void가 아니고 int라 되어있는 건 돌려줄 때는 int로 준다는것임. 
		System.out.println("test4_2 메소드 호출");
		return new Scanner(System.in);				// ctrl space로 불러와주긴 해야해요
	}
	
	// 반환도 있고 매개변수도 있는 메소드
	
	public static String test5(String name, int index) {
		System.out.println("name: " + name);
		System.out.println("index: " + index);
		System.out.println("test5 메소드 호출");
		return name + index;
		
	}
	
	// 반환값이 없는 메소드에서 메소드를 강제로 탈출하는 방법
	public static void test6(String names) {
		while(true) {
			int tokenIndex = names.indexOf(", ");
			String name = tokenIndex != -1 ? names.substring(0, tokenIndex)
					: names;
			System.out.println(name);
			if(name.equals(name)) {
				// return; // return은 그 즉시 함수 종료
				break; 
			}
			if(tokenIndex == -1) {
				break;
			}
			names = names.substring(tokenIndex + 2);
		}
		
		System.out.println("메소드가 정상적으로 종료되었음."); // break를 쓰면 함수가 끝까지 돌게 됨. 
	}
	
	public static void main(String[] args) {
		test1();
		test1();
		test1();
		
		test2(1234);
		test3(1111,2222);
		
		int a = test4();
		System.out.println(a);
		System.out.println(test4());
		
		String result = test5("김준일", 1);
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		
		String names = "김준일, 김준이, 김준삼, 김준사";
		test6(names);
	}

}

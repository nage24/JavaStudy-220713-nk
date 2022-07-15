package j03_연산자;

/*
 * 논리연산
 * 
 * AND연산 (&&) - 곱  // 둘 다 true 일 때만 true (ex. 필수사항)
 * true & true => true (1)
 * true & false => false (0)
 * false & false => false (0)
 * 
 * OR연산 (||) - 합   // 둘 중 하나라도 true 이면 true (ex. 선택사항)
 * true || true => true (1)
 * true || false => true (1)
 * false || false => false (0)
 * 
 * NOT연산 (!) - 부정
 * !true => false
 * !false => true
 * 
 * !(true $$ false) => true
 * 
 */


public class Operation2 {

	public static void main(String[] args) {
		boolean result = 10 != 5;
		boolean result2 = 10 == 5;
		
		System.out.println("" + result + result2); //불린은 사칙연산 안됨. 불린형 연산 -> 논리연산
		
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0 && 2000 % 5 == 0); // (true && false => false) && true => false
	}

}

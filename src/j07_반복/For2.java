package j07_반복;

public class For2 {

	public static void main(String[] args) {
//		int dan = 2;
//		
//		for(int i = 0; i < 9; i++) { // 1번은 딱 한번만 실행되고 조건문으로 이동 -> 참일 때는 실행문으로 이동 후 -> 3번으로 이동하는 순서. 
//			int num = i + 1;
//			System.out.println(dan + " x " + num + " = " + (dan + num));
//		}
		
		// 2단 부터 9단 까지
		
		
		for (int num1 = 2; num1 < 10; num1++) {
			System.out.println("\n" + num1 + "단을 출력합니다. ");
			for (int i = 1; i < 10; i++) {
				System.out.println(num1 + " x " + i + " = " + (num1 * i));
			}

			// 강사님 코드 참고 ;; 
		}
	}
}



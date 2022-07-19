package j06_조건;

public class If1 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작\n");

		boolean breakfast = true;
		boolean academy = true;

		if(breakfast) { // if(조건) { } // if else ; if 조건이 참이 아닐 때 실행되는 조건문.
			// 조건이 true이면 ...
			System.out.println("밥을 차려 먹는다. ");
		}else { // 이 양식을 지켜야 해요
			System.out.println("밥을 차려 먹지 않는다. "); // 명령이 하나라 if문 중괄호를 생략할 수 있다. 근데 더 쓰려면 중괄호로 하나의 명령으로 묶어 if 문 안에 넣어줘야 합니다
		}

		if(academy) {
			System.out.println("가방을 챙긴다. ");
		}else {
			System.out.println("논다. ");
		}

		// ctrl shift f ; 자동정렬

		System.out.println("\n프로그램 종료");
	
	}

}

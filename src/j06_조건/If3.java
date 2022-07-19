package j06_조건;

public class If3 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		String result = null;
		
		x = 12;
		y = -2;
		
		// 원래 삼항연산자로 풀지만 if로 한 번 풀어보기
		if (x <= -1000 || x >= 1000 || y <= -1000 || y >= 1000) {
			result = "숫자를 작게 설정해 주세요";
		}else if (x > 0 && y > 0) { result = "1 사분면";
		}else if (x < 0 && y > 0) {result = "2 사분면";
		}else if (x < 0 && y < 0) {result = "3 사분면";
		}else if (x > 0 && y < 0) {result = "4 사분면";
		}else if (x == 0 || y == 0) {result = "원점입니다.";
		}

	System.out.println("x: "+x);System.out.println("y: "+y);System.out.println("결과: "+result);

}

}

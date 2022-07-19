package j06_조건;

public class If2 {

	public static void main(String[] args) {
		int score = 85;
		String result = null;

		if (score < 0 || score > 100) {
			System.out.println("점수는 0 ~ 100점 사이여야 합니다.");
			result = "계산 불가";
		}else if (score > 89) {
			System.out.println("90점대 입니다.");
			result = "A";
		}else if (score > 79) {
			System.out.println("80점대 입니다.");
			result = "B";
		}else if (score > 69) {
			System.out.println("70점대 입니다.");
			result = "C";
		}else {
			System.out.println("0~59점 입니다.");
			result = "F";

		// 들여쓰기 단축문 ; 영역 선택 후 tap 
		// 들여오기 ; shift + tap
			
		// Operation5 에 있는 삼항 연산자와의 차이? -> if문은 명령을 실행하는 지점을 옮기고, 삼항 연산자는 그냥 연산하는 거죠. 
		// 같은 결과를 내려고 한다면, 삼항 연산자를 쓰는 것이 CPU 원리 상 성능이 매우 좋겠죠? 
			
				}
			}
		}
package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		// 클래스 이름 바꾸기 단축키 ; F2
		// switch case 는 잘 사용되진 않고, if문이 보편적으로 쓰입니다. 
		
		int score = 100;
		boolean breakFlag = true;
		
		switch(score / 10) { // 시작점 지정. 
			case 10: 		 // 100점이면 case 10 실행 후 case 9가 실행되기 때문에 굳이 뭘 안 써줘도 되겠죠. 
			case 9:
				System.out.println("A");
				if(breakFlag) {
					break;	// break문은 if문은 탈출할 수 없습니다. if 만 제외하고 나머지 제어문들에서는 사용할 수 있습니다 ^^
				}
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("그 외에 실행"); // else 같은 .. 
			
		}

	}

}

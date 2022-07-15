package j03_연산자;

/*
 * 
 * Ctrl + space -> 자동완성 단축키
 * 단축키 sysout -> ctrl + space
 * 커서 선택줄만큼 ctrl + alt + 방향키 -> 방향키가 가리킨 방향으로 영역복사
 * 
 */

public class Operation1 {

	public static void main(String[] args) {
		int num = 50; 
		
		System.out.println(++num); // 51 -> 선 증가, 바로 1 증가
		System.out.println(num);
		System.out.println(num++); // 51 -> 후 증가, 지금은 그대로 쓰고, 다음 번에는 1 증가된 상태가 됨. 
		System.out.println(num);   //감소도 마찬가지
		
		System.out.println(--num); // 51 -> 선 증가, 바로 1 증가
		System.out.println(num);
		System.out.println(num--); // 51 -> 후 증가, 지금은 그대로 쓰고, 다음 번에는 1 증가된 상태가 됨. 
		System.out.println(num);   //감소도 마찬가지

		// 프로그래밍은 0부터 이기 때문에 관계 연산자(<,>,==,!=,<=,>=) 사용 시 초과, 미만(<,>) 사용하는 습관을 가집시다. 
		
	}

}

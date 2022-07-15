package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		int number = 10;
		number = 80;
		
		// MAX_NUMBER = 200; -> 상수는 최초로 값이 한 번 들어가고 나면 변경할 수 없음. 
		
		System.out.print("최소값: " + MAX_NUMBER);
		System.out.print("최대값: " + MIN_NUMBER);
		System.out.print("현재값: " + number);
		

	}

}

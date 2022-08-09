package j20_예외처리;

public class ExceptionTestMain {

	public static void main(String[] args) throws Exception {	// 예외 미루기?
		
		ExceptionTest2 exceptionTest2 = new ExceptionTest2();
		try {
			exceptionTest2.printArray();
		}catch (Exception e) {
			System.out.println("예외발생");
		}
		
		System.out.println("프로그램 종료");

	}

}

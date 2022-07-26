
public class MethodEx {

	public static void test1() { 				// void 는 비어있다; 즉, 반환값이 없다는 뜻. 
		System.out.println("test1 메소드 호출\n");
	}
	
	// 반환이 없고 매개변수가 하나이 메소드 
	
	public static void test1(int num) {
		System.out.println("num: " + num);
		System.out.println("test1 메소드 호출\n");
	}
	
	// 반환이 없고 매개변수가 두개인 메소드
	public static void test1(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println("test1 메소드 호출\n");
	}
	
	public static void main(String[] args) {
		test1();
		test1(10);
		test1(10, 20);

	}

}

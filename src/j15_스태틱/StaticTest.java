package j15_스태틱;

public class StaticTest {
	
	public static String name;
	private int age;		// 클래스가 만들어지지 않앗음. 즉 만들어 지지도 않음 ;; 생성도 되지 않음. 스태틱 아네서는 일반 멤버 변수들은 사용할 수 없다. 
	
	public static void printTest() {
		System.out.println("\n출력");
		System.out.println(name + "\n");
		// System.out.println(age);		// 스태틱 메소드안에서는 스태틱 멤버들만 ! 
										// 그래서 객체 하나 만들고 거기서 게터 세터로 한번 꼬아주는 방법을 사용.
		
	}
	
}

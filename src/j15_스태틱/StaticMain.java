package j15_스태틱;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticTest.name = "name";
		StaticTest.printTest();
		
		StaticTest staticTest = new StaticTest();
//		staticTest.name = "김준일";
		
//		System.out.println(staticTest.name);
//		
//		StaticTest staticTest2 = new StaticTest();
//		System.out.println(staticTest2.name);
//		
//		staticTest2.name = "김준이";
		System.out.println(staticTest.name); 
		
		// static 은 heap 영역 아닌 stack 영역에 만들어져 버린다. 
		// 해당 클래스 파일 안에 고정주소를 가지게 되는 것임. 
		

	}

}

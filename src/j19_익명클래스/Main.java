package j19_익명클래스;

public class Main {

	public static void main(String[] args) {
		AbstractTest abstractTest = new AbstractTestImpl();
		
		abstractTest.add(10,20);
		
		abstractTest.showData("JSON");
		
		AbstractTest abstractTest2 = new AbstractTest() {	// 상속을 받은 Impl의 중괄호임. 한번쓰고 말 클래스를 굳이 클래스 파일 만들어서 구현할 필요가 없다. 
			
			@Override
			public void showData(String data) {
				System.out.println("여기에서만 사용가능한 data");
				
			}
			
			@Override
			public void add(int num1, int num2) {
				System.out.println("더할 때 딱 한번만 사용함.");
			}
		}; // Anonymous 
		
		abstractTest2.add(1, 2);
		abstractTest2.showData("2323");
	}

}

package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		char name1 = '김'; // \u0000 ; 유니코드, 십진수로 바꿀 수 있음. 
		char name2 = '준';
		char name3 = '일';
		String name = "김준일";
		
		int age = 29;
		
		String address = "부산 동래구 사직동";
		
		System.out.println("결과: " + 10 + 20); //문자열로 반주됨. 
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3); // ""을 붙여주어 문자열을 만들어주어야 합니다.
		System.out.println(name);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);

		
	}

}

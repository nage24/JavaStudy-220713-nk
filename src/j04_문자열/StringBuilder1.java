package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("이름 : ");
		stringBuilder.append("김준일"); // 계속 추가 추가 추가해서 이어줍니다
		stringBuilder.delete(1, 2);
		
		// □□□□□□□□□□□□□□□□□□□□□□□□ -> 버퍼의 개념
		
		System.out.println(stringBuilder.toString()); // toString ; 문자열로 뽑아줍니다. 
		
	
	}

}

package j07_반복;

public class ProtocolSubString {
	/*
	 * @뒤에 오는 문자열이 명령어
	 * : 뒤에 오는 문자열은 내용
	 * data에 들어있는 내용을 각 변수에 넣어봅시다. 
	 */
		
	public static void main(String[] args) {
		
		String data = "@Message:안녕하세요.@To:김준일@From:김준일@SendDate:2022/07/21";
//		String message = null;
//		String to = null;
//		String from = null;
//		String sendDate = null;
		
		// @를 기준으로 문자열을 잘라주고, :을 기준으로 명령어와 내용을 분리하여 내용을 변수에 넣어준다. 
				
		int i = 0;
		int index = data.indexOf("@", i + 1); // -> 15
		System.out.println(data.substring(0, index));

		// index 16부터 그 다음 골뱅이 전까지 잘라준다

		int index2 = data.indexOf("@", index + 1); // -> 22
		System.out.println(data.substring(index, index2)); // -> 15, 22
		index = data.indexOf("@", index2); // 인덱스를 업데이트를 해줘야 합니다. 이제 인덱스 2로부터 @를 찾아와줍니다.
		System.out.println(index);

		//

		index2 = data.indexOf("@", index + 1);
		System.out.println(data.substring(index, index2));
		index = data.indexOf("@", index2);
		System.out.println(index2); // -> 31

		// 마지막 SendDate는 "@"가 없음 ㅠㅠㅠ equal 을 쓰면 -1 값이 나올 것입니다. (false)

		index2 = data.indexOf("@", index + 1); // -> 23로부터 @를 찾아라 -> 31
		System.out.println(index2); // -> -1 , 없다는 듯 .

		if (index2 == -1) {
			System.out.println(data.substring(index, data.length()));
		}
		;
			
			
			
//일단 메시지까지 잘라줍시다
// -> data.substring(index, index2);'
// index는 그 다음 @가 나올 위치. index2는 index부터 또 @가 나올 위치 임.
					 
// 0 부터 :까지 자르면 그게 명령어니까 , 명령어 인덱스가 끝나는 위치 + 1에서 그 다음 골뱅이가 나올 때까지 잘라주면 댈듯 ..

		
		
		
		
//		System.out.println("Message: " + message);
//		System.out.println("To: " + to);
//		System.out.println("From: " + from);
//		System.out.println("SendDate: " + sendDate);
		
	}
}

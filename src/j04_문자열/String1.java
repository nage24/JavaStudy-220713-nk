package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("\"\t안녕하세요.\""); //문자열 안에 "" 넣고 싶으면 앞에 역슬러쉬(\)를 같이 써줍니다. escape 문자라고 합니다.
		
		// java escape 문자
		
		/*
		 * 
		 * \\(back slash) -> \ 출력
		 * \n -> new line , 다음 줄로 이동됨. 
		 * \r -> carriage return , 운영체제가 다를 때 씀. 지금은 무시해도 무관. 
		 * \t -> tab , 탭 키만큼 수평으로 띄움. 콘솔창에서는 띄워져도 다른 곳에서는 탭으로 인식 못하기 때문에 명확히 써야한다. 
		 * \b -> backspace , 바로 앞 문자를 하나 지움. 
		 * \f -> Formfeed , 프린터에서 강제적으로 다음 페이지로 넘길 때 사용. 
		 * \' -> ' 출력
		 * \" -> " 출력
		 * 
		 */
		
		String address = "부산시 동래구 사직동";
		
		// indexOf ; 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌. 
		int index = address.indexOf("동");
		int index2 = address.lastIndexOf("동");
		
		System.out.println(index);
		System.out.println(index2);
		
		// substring ; 해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		String subAddress = address.substring(index, index2 + 1); //동 부터 동 까지 (동 전까지 출력되므로 + 1)
		
		// 모든 프로그래밍은 (시작점, 끝의 전까지) 라는 기준
		// (0, 4) 이면 0, 1, 2, 3 까지 !
		
		System.out.println(subAddress);
		
		// 해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		
		replaceAddress = address.replaceAll("-", " ");
		System.out.println(replaceAddress);
		
		// 방법 1
		String phoneNumbers = "010/9044/2249, 010/1234/5678";
		String rePhone = phoneNumbers.replaceAll("010", "011");
		rePhone = rePhone.replaceAll("/", "-");
		rePhone = rePhone.replaceAll(", ", "/");
				
		System.out.println(rePhone);
		
		// 방법 2
		String rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/");
		
		System.out.println(rePhone2);
		
		
		
	}

}

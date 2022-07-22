package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * 
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 * 
		 * 인덱스가 하나씩 증가할 것입니다. ; substring 활용
		 */
		
		String str = "abcdefghijk";
		
		System.out.println(str.indexOf("k"));
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i + 1));
		}
		
		
		String address = "부산 동래구 사직동 중앙대로";
		
		for(int i = 0; i < address.length(); i++) {
			String subStr = address.substring(i, i + 1); 	// 한 글자씩 잘라줄 겁니다. 
			// System.out.println(subStr);
			
			if(subStr.equals(" ")) { 		// 요 문자열이랑 내 문자열이랑 같은지를 비교하는 겁니다. ;띄어쓰기가 찾으면 true가 되면서 글자를 잘라줄 겁니다. 
				int index = 0;				// 인덱스 초기화
				String temp = address.substring(0,i);		// temp에다가 기존 address에서 substring을 해 줄겁니다. i 번째라는 건 띄어쓰기까지가 되겠죠
				
				if(temp.contains(" ")) {    // contains 는 띄워쓰기(안에 인자)가 있으면 트루가 됨. 
					index = temp.lastIndexOf(" ") + 1; 		// 뒤에서부터 띄어쓰기 찾아주기
					System.out.println(temp.substring(index, i)); 	// 마지막부터 잘라서 "부산 동래구"가 temp에 들어와 있을 것. 
				}else {
					System.out.println(temp.substring(0, i));		
				}
				
				
			}
			if(i == address.length() - 1) { 
				System.out.println(address.substring(address.lastIndexOf(" ") + 1)); 	// 제일 끝에서 부터 띄워쓰기 찾아라 ...
			}
			
		}

	}

}

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
		
		for(int i = 0; i < 11; i++) {
			String subStr = address.substring(i, i + 1);
			if(subStr.equals(" ")) { 		// 요 문자열이랑 내 문자열이랑 같은지를 비교하는 겁니다. 그 때 공백이 겹치면 그 전까지 딱 자르자는 if문입니다. 
				int index = 0;
				String temp = address.substring(0,i);
				if(temp.contains(" ")) { // contains 는 띄워쓰기(안에 인자)가 있으면 트루가 됨. 
					index = temp.lastIndexOf(" "); // 마지막부터 잘라서 "부산 동래구"가 temp에 들어와 있을 것. 
					System.out.println(temp.substring(index, i));
				}else {
					System.out.println(temp.substring(0, i));
				}
				
				
			}
			if(i == address.length() - 1) { 
				System.out.println(address.substring(address.lastIndexOf(" ") + 1));
			}
		}

	}

}

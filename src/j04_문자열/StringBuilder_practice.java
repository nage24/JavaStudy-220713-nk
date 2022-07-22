package j04_문자열;

public class StringBuilder_practice {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		String family = "신짱구와 신짱아와 봉미선과 신영식 가족!";
		
		int index = 0;
		
		index = family.indexOf("와", index+1); // 조사가 위치하는 인덱스 번호를 찾아줌
		// 뒤의 인자에 준 지점부터 인덱스를 찾아서 보여달란 뜻. 즉 1부터 "와"를 찾아라. 는 뜻
		
		// 이름을 
		// stringBuilder.append();
		
		stringBuilder.append(family.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = family.indexOf("와", index+1);
		stringBuilder.append(family.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = family.indexOf("과", index+1);
		stringBuilder.append(family.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = family.indexOf(" 가족", index+1);
		stringBuilder.append(family.substring(index - 3, index));
		
		System.out.println(stringBuilder.toString());
		
		
		
	}

}

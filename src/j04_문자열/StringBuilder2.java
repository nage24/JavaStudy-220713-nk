package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		
		
		int index = 0; // '님'의 위치보다 -3임
		String names = "김준일님, 서재효님, 임나영님, 문창배님, 전나경님";
		// 김준일/서재효/임나영/문창배/전나경
		
		StringBuilder stringBuilder = new StringBuilder();
		
		index = names.indexOf("님", index+1); // 뒤의 인자는 index를 써 주고, 이 인덱스 이후로 찾아줘 라는거
		stringBuilder.append(names.substring(index - 3, index)); // 시작은 똑같이 '님' -3
		stringBuilder.append("/"); // 가능한 플러스 연산자보다 이렇게 쓰는게 성능이 좋다고 합니다 ... 

		index = names.indexOf("님", index+1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index+1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index+1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index+1);
		stringBuilder.append(names.substring(index - 3, index)); // 나중에 반복문 사용할 것이므로 잘 생각해서 같은 로직으로 만들어줘요. 
		
		
		System.out.println(stringBuilder.toString()); 
		
		// 2
		
		int index2 = 0;
		
		StringBuilder stringBuilder2 = new StringBuilder();
		
		stringBuilder2.append(names);
		
		index2 = stringBuilder2.indexOf("님"); // delete는 삭제되므로 굳이 +를 붙여줄 필요가 없습니다. 앞의 '님'은 지워진 상태가 될 거에요. 
		stringBuilder2.delete(index2, index2 + 3); 
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		
		
		//names = names.replaceAll("님, ", "/")
		//		.replace("님", "");
		
		System.out.println(stringBuilder2.toString());
		
	}

}

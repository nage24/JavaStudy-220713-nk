package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); // String 값들을 담겠다 .. 
		
		//값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("html");
		
		//원하는 위치에 값 추가
		list.add(1, "1번인덱스에 값넣기");
		
		// 리스트의 크기
		System.out.println("list 크기: " + list.size());
		
		// 리스트 toString()
		System.out.println(list);	// toString 이 자동으로 실행되어서 보여줌. 
		// 모든 컬렉션은 toString 지원함. 
		
		// 리스트에서 해당 인덱스 값 찾기
		String subject = list.get(0);
		System.out.println("0번 인덱스의 값: " + subject);
		
		// 리스트에서 인덱스 찾는 방법
		int findIndex = list.indexOf("python");
		System.out.println("python이 있는 위치: " + findIndex);
		
		// 해당 인덱스 위치의 값을 수정
		list.set(3, "c++");
		System.out.println(list);
		
		// 해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("python");
		tempList.add("c++");
		tempList.add("spring");
		
		boolean contains = list.contains("java");
		boolean containsAll = list.containsAll(tempList);	// 해당 객체에 들어잇ㄴ느 값이 모두 있는지. 
		
		System.out.println("contains: " + contains);
		System.out.println("containsAll: " + containsAll);
		
		// 다른 컬렉션의 데이터를 모두 추가
		list.addAll(tempList);
		System.out.println(tempList);
		System.out.println(list);
		
		// 값 삭제
//		list.remove("python");
//		System.out.println(list); 	// 0부터 첫번째 "python"이 삭제됨. 
//		
//		list.remove(5);
//		System.out.println(list);
//		
//		list.removeAll(tempList);
//		System.out.println(list);
		
		list.retainAll(tempList); // 해당 컬렉션을 포함하는 것을 제외하고 다 지움
		System.out.println(list);
		
		// 리스트가 비었는지 확인
		System.out.println(list.isEmpty());
		
		// 리스트 전체 비우기
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		// 배열에 있는 값을 리스트에 넣어주고 싶으면
		List<String> aslist = Arrays.asList(new String[] {"java", "python", "c++", "html"}); 	// 배열을 리스트로 바꿔줌
		System.out.println(aslist + "***");
		 
		list.addAll(aslist);	// 바꿔준 뒤에 넣어준다. 
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}	
		
		System.out.println("<<<< for each>>>>");
		
	// for each
		for(String str : list) { // 대입해서 출력하는 방식임. 리스트에서 값을 하나씩 꺼내서 str 에 대입하고 출력하고 ...  다른 점은 리스트가 안 돌게 된다는 것임. 딱히 인덱스가 없어도 된다. 
			// 인덱스가 꼭 필요한 경우 아니면 이걸 사용하는 것이 더 간편. 
			System.out.println(str);
		}
		
		String roles = "USER,ADMIN,TEST_USER"; // 얘를 배열로 담아주자
		String[] roleArray = roles.split(","); 	// , 기준으로 잘잘라서 넣어주기
		System.out.println(roleArray[0]);
		System.out.println(roleArray[1]);
		System.out.println(roleArray[2]);
		
		Arrays.asList(roleArray).forEach(arg -> {	// 이 화살표를 람다라고 한다링
			System.out.println("role: " + arg);
		});
		
	}
}
	

package j17_컬렉션.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*
		 * Map안에 리스트 안에 List을 저장하는 구조를 배운다.
		 */
		
		Map<String, Object> map = new HashMap<String, Object>();	// 값저장 혹은 리턴자료형에 ?씀. 생성할 땐 X 
												// 최상위 클래스 Object
		map.put("code", 1);
		map.put("message", "1page list success to load");
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> innerMap = new HashMap<String, Object>();
		innerMap.put("todoCode", 182);
		innerMap.put("todo", "스프링 부트 서버 테스트_182");
		innerMap.put("todoComplete", true);
		innerMap.put("importance", false);
		innerMap.put("totalCount", 157);
		innerMap.put("incompleteCount", 78);
		
		Map<String, Object> innerMap2 = new HashMap<String, Object>();
		innerMap2.put("todoCode", 181);
		innerMap2.put("todo", "스프링 부트 서버 테스트_181");
		innerMap2.put("todoComplete", true);
		innerMap2.put("importance", false);
		innerMap2.put("totalCount", 157);
		innerMap2.put("incompleteCount", 78);
		
		list.add(innerMap);
		list.add(innerMap2);
		map.put("data", list);
		
		System.out.println(map);
	}

}

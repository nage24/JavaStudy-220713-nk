package j17_컬렉션.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Json2 {	// alt f5 maven update

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("count", 1111);
		map.put("next", "http://~~~");
		map.put("previous", null);
		
		List<Map<String, String>> list = new ArrayList<>();
		
		Map<String, String> innerMap1 = new HashMap<String, String>();
		innerMap1.put("name", "address001");
		innerMap1.put("url", "http://address001");
		
		Map<String, String> innerMap2 = new HashMap<String, String>();
		innerMap2.put("name", "address002");
		innerMap2.put("url", "http://address002");
		
		Map<String, String> innerMap3 = new HashMap<String, String>();
		innerMap3.put("name", "address003");
		innerMap3.put("url", "http://address003");
		
		list.add(innerMap1);
		list.add(innerMap2);
		list.add(innerMap3);
		
		map.put("results", list);
		
		System.out.println(map);
	}

}

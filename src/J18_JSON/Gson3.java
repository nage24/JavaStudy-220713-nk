package J18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson3 {

	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// Map -> JSON
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 1);
		map.put("message", "json 형변환 텍스트");
		map.put("data", user);
		
		String mapJson = gson.toJson(map);
		
		System.out.println(mapJson);
		System.out.println();
		
		// JSON -> Map 
		
		Map<String, Object> mapObj = gson.fromJson(mapJson, Map.class);
		
		System.out.println(mapObj);
		
		mapObj.replace("code", ((Double) mapObj.get("code")).intValue());	// intValue 는 Double 이 가진 ..
		// 클래스 형태의 Double 만 사용가능하다고 합니다. 
		
		System.out.println(mapObj);

	}

}

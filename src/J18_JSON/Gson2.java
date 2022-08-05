package J18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.serializeNulls()
				.setPrettyPrinting()
				.create(); // serializeNulls() ; 
		
		
		// 객체를 JSON으로 변환 -> toJson(객체)
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
		System.out.println("--------------------");
		
		
		// JSON을 객체로 변환 -> fromJson(json 문자열, 변환 할 객체 클래스);
		User userObj = gson.fromJson(userJson, User.class);	// 객체로 변환됨. 게터세터 다 쓸수 있게 됨. 
		
		System.out.println(userObj);
		System.out.println(userObj.getAddress());
	}

}

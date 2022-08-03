package j17_컬렉션;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		HashMap<String, String> strMap2 = new HashMap<String, String>();
		
		strMap.put(10, "java1");
		strMap.put(20, "java1");
		strMap.put(30, "java1");
		strMap.put(40, "java1");
		
		System.out.println(strMap);
		strMap2.put("a", "python");
		strMap2.put("b", "python");
		strMap2.put("c", "python");
		strMap2.put("d", "python");
		
		System.out.println(strMap2);
		
		strMap.get(10);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}
	}
	
// 충격 컨트롤 f11하니까 콘솔에러가 뜨고
	// 걍 f11 은 디버깅 모드였삼 ;;;;
	// 난 내 코드 문제인줄 ㅡㅡ 헛발길 오졌다리
}

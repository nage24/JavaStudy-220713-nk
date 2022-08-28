package j19_익명클래스.ForEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionForEach {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i< 26; i++) {
			strList.add(Character.toString((char) (97 + i)));	// 유니코드 아스키코드 a는 모두 97번이당
		}
		
		System.out.println(strList);

//		for(String str : strList) {
//			System.out.println(str);
//		}
		
		
		// for each 위나 아래로 스면 되는데 쓰다보면 밑에께 편해질 것임 .. 라고 하심.. 
		
		strList.forEach(str -> System.out.println(str));
		
		Consumer<String> consumer = str -> {
			System.out.println(str);
			};	// 리턴있으면 일단 중괄호 !! 람다식
		
		strList.forEach(consumer);
	
		Set<String> strSet = new HashSet<String>();
		
		for(int i = 0; i < 26; i++) {
			strSet.add(Character.toString((char) (97+i)));
		}
		
		for(String str : strSet) {
			System.out.println(str);
		}
		
		strSet.forEach(str -> {System.out.println();});
		
		System.out.println("===========================");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < 26; i++) {
			map.put(Character.toString((char) (97+i)), 97+i);
		}
	
		map.forEach((k, v) -> System.out.println("KEY: " + k + "\t" + "VALUE: " + v));
		
	}
}

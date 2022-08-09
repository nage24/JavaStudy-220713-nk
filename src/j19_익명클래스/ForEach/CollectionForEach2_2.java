package j19_익명클래스.ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectionForEach2_2 {

	public static void main(String[] args) {
		
		String names = "김준일, 강민지, 박진관, 오유리, 조문기, 김호영, 박소영, 고준호, 서재효, 하덕현";
		int studentCode = 20220001;
		
		List<String> nameList = Arrays.asList(names.replaceAll(" ", "").split(","));
		List<Integer> studentCodeList = new ArrayList<Integer>();
		Map<Integer, String> studentMap = new TreeMap<Integer, String>();
		
		for(int i = 0; i < nameList.size(); i++) {
			studentCodeList.add(studentCode + i);
			studentMap.put(studentCode + i, nameList.get(i));
		}
		
		studentMap.forEach((code, name) -> {
			System.out.print("이름: " + name + ", ");
			System.out.println("학번: " + code);
		});
		
		
	}

}

package chap15.sec04.art01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExaple1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		// "홍길동" 키가 같기 때문에 제일 마지막에 저장한 값으로 대치됨.
		map.put("홍길동", 95);
		
		// 총 Entry(key/value 세트) 수 얻기
		System.out.println("총 Entry 수: " + map.size());

		// 이름(키)으로 점수(값)를 검색
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();

		// Key Set 얻기
		Set<String> keySet = map.keySet();
		
		// 반복해서 키를 얻고 값을 Map에서 얻어냄
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 키로 Map.Entry를 제거
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());

		// Map.Entry Set 얻기
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		// 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}

		System.out.println();

		// 모든 Map.Entry 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());

	}
}

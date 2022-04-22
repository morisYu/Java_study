package chap15.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Chap15Ex09_MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("while", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			if(value>maxScore) {
				maxScore = value;
				name = key;
			}
			totalScore += value;
		}

		System.out.println("평균점수: "+(int)(totalScore/3));
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고점수 받은 아이디: "+name);
	}
}

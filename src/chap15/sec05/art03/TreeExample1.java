package chap15.sec05.art03;

import java.util.Map;
import java.util.TreeMap;

public class TreeExample1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		Map.Entry<Integer, String> entry = null;
		
		// 제일 낮은 Map.Entry를 리턴
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: "+entry.getKey()+"-"+entry.getValue());
		
		// 제일 높은 Map.Entry를 리턴
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: "+entry.getKey()+"-"+entry.getValue());
		
		// 주어진 키보다 바로 아래 Map.Entry를 리턴
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수: "+entry.getKey()+"-"+entry.getValue());
		
		// 주어진 키보다 바로 위 Map.Entry를 리턴
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위의 점수: "+entry.getKey()+"-"+entry.getValue());
		
		// 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴
		// 동등한 키가 없다면 바로 아래의 Map.Entry를 리턴
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수: "+entry.getKey()+"-"+entry.getValue());
		
		// 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴
		// 동등한 키가 없다면 바로 위의 Map.Entry를 리턴
		entry = scores.ceilingEntry(new Integer(95));
		System.out.println("85점 이거나 바로 위의 점수: "+entry.getKey()+"-"+entry.getValue());
	
		while(!scores.isEmpty()) {
			// 제일 낮은 Map.Entry를 꺼내오고 컬렉션에서 제거함
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+"(남은 객체 수: "+scores.size()+")");
		}
		
		while(!scores.isEmpty()) {
			// 제일 높은 Map.Entry를 꺼내오고 컬렉션에서 제거함
			entry = scores.pollLastEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+"(남은 객체 수: "+scores.size()+")");
		}
	
	}
}

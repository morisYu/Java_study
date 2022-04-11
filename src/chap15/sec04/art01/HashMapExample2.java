package chap15.sec04.art01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "홍길동"), 95);
		// 학번과 이름이 동일하기 때문에 마지막에 저장된 값으로 대치됨.
		map.put(new Student(1, "홍길동"), 75);
		
		map.put(new Student(2, "김자바"), 85);
		// 이름은 같으나 학번이 다르기 때문에 키와 값이 추가됨.
		map.put(new Student(3, "김자바"), 60);

		System.out.println("총 Entry 수: " + map.size());
	}
}

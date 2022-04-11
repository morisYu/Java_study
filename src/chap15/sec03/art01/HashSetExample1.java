package chap15.sec03.art01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		// 이미 저장되어있는 객체의 해시코드를 비교해서 동일한 해시코드가 있다면
		// equals() 메소드로 두 객체를 비교 후 동일한 경우 중복 저장하지 않음.
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();

		System.out.println("총 객체수: " + size);

		// 인덱스로 객체를 검색하는 메소드가 없는 대신 전체 객체를 대상으로 한 번씩
		// 반복해서 가져오는 반복자(Iterator)를 제공함.
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		// HashSet은 객체들을 순서없이 저장하기 때문에 인덱스로 객체를 삭제할 수 없음
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수: " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}
}

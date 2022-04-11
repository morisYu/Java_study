package chap15.sec02.art03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// ArrayList 는 내부 배열에 객체를 저장해서 인덱스로 관리
		// 특정 인덱스의 객체를 삭제하면 뒤의 객체는 인덱스가 1씩 앞으로 당겨짐
		List<String> list1 = new ArrayList<String>();
		// LinkedList 는 인접 참조를 링크해서 체인처럼 관리
		// 특정 인덱스의 객체를 삭제하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않음
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		// 데이터의 조회는 ArrayList 가 빠름
		for (int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		startTime = System.nanoTime();
		list1.get(5000);
		endTime = System.nanoTime();
		System.out.println("ArrayList 검색시간: " + (endTime - startTime) + " ns");

		for (int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		startTime = System.nanoTime();
		list2.get(5000);
		endTime = System.nanoTime();
		System.out.println("LinkedList 검색시간: " + (endTime - startTime) + " ns");

		// 데이터의 추가, 삭제가 빈번한 경우 LinkedList 의 처리속도가 빠름.
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 처리시간: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 처리시간: " + (endTime - startTime) + " ns");
	}
}

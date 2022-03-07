package chap11.sec03.art02;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		Key key = new Key(1);
		System.out.println(key);
		System.out.println(key.hashCode());

		// 식별키 "new Key(1)" 로 "홍길동"을 저장함.
		hashMap.put(new Key(1), "홍길동");
		System.out.println("hashMap에 저장되어있는 키, 값");
		System.out.println(hashMap);
		// 식별키 "new Key(1)"로 "홍길동"을 읽어옴.
		String value = hashMap.get(new Key(1));
		System.out.println(value);

		System.out.println("----------------------");
		System.out.println("hashCode() 메소드를 재정의");
		// hashCode() 메소드를 재정의한 Key2 클래스 사용
		HashMap<Key2, String> hashMap2 = new HashMap<Key2, String>();

		Key2 key2 = new Key2(15);
		System.out.println(key2);
		System.out.println(key2.hashCode());

		// 식별키 "new Key(1)" 로 "홍길동"을 저장함.
		hashMap2.put(new Key2(15), "홍길동");

		// 식별키 "new Key(1)"로 "홍길동"을 읽어옴.
		String value2 = hashMap2.get(new Key2(15));
		System.out.println(value2);
	}
}

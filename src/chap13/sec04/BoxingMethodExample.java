package chap13.sec04;

import chap13.sec02.Box2;

public class BoxingMethodExample {
	public static void main(String[] args) {
		// 명시적으로 구체적 타입을 지정
		Box2<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		// 컴파일러가 매개값의 타입을 보고 구체적인 타입을 추정
		Box2<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	}
}

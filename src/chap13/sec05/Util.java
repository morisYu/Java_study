package chap13.sec05;

public class Util {
	// 숫자를 연산하는 제네릭 메소드는 매개값으로 Number 타입 또는 하위 클래스 타입
	// (Byte, Short, Integer, Long, Double)의 인스턴스만 가져야 한다.
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}

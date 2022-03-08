package chap11.exercise;

public class Chap11Ex11_IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		// 박싱된 값이 -128에서 127 사이의 값이면 "=="로 비교 가능
		System.out.println("obj1==obj2: " + (obj1 == obj2));
		System.out.println("obj3==obj4: " + (obj3 == obj4));
		System.out.println("obj3.equals(obj4): " + obj3.equals(obj4));

	}
}

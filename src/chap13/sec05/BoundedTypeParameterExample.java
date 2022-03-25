package chap13.sec05;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String 은 Number 타입이 아님
		// String str = Util.compare("a", "b");
		
		// int -> Integer로 자동 Boxing
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		// double -> Double로 자동 Boxing
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
}

package chap13.sec05;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String �� Number Ÿ���� �ƴ�
		// String str = Util.compare("a", "b");
		
		// int -> Integer�� �ڵ� Boxing
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		// double -> Double�� �ڵ� Boxing
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
}

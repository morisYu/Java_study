package chap08.sec07.art01;

public class DefaultMethodExample {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		MyInterface mi2 = new MyClassB();

		mi1.method1();
		mi1.method2();

		mi2.method1();
		mi2.method2();
	}
}

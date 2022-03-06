package chap07.sec07.art01;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();

		// 자동 형변환(Promotion)
		Parent parent = child;
		parent.method1();
		parent.method2();
//		호출 불가능
//		parent.method3();
	}
}

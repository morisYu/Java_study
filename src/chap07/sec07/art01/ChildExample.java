package chap07.sec07.art01;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();

		// �ڵ� ����ȯ(Promotion)
		Parent parent = child;
		parent.method1();
		parent.method2();
//		ȣ�� �Ұ���
//		parent.method3();
	}
}

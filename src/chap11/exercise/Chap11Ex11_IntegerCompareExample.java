package chap11.exercise;

public class Chap11Ex11_IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		// �ڽ̵� ���� -128���� 127 ������ ���̸� "=="�� �� ����
		System.out.println("obj1==obj2: " + (obj1 == obj2));
		System.out.println("obj3==obj4: " + (obj3 == obj4));
		System.out.println("obj3.equals(obj4): " + obj3.equals(obj4));

	}
}

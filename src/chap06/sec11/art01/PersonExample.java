package chap06.sec11.art01;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "���");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		// final �ʵ�� ���� �Ұ�
//		p1.nation = "USA";
//		p1.ssn = "111111-1111111";
		p1.name = "KIM";

	}
}

package chap11.exercise;

import java.util.HashMap;

public class Chap11Ex03_StudentExample {
	public static void main(String[] args) {

		// Student Ű�� ������ �����ϴ� HashMap ��ü �ۼ�
		HashMap<Chap11Ex03_Student, String> hashMap = new HashMap<Chap11Ex03_Student, String>();

		// new Student("1")�� ���� 95 �� ����
		Chap11Ex03_Student stu1 = new Chap11Ex03_Student("1");
		System.out.println(stu1);
		hashMap.put(stu1, "95");

		// new Student("1")�� ������ �о��
		Chap11Ex03_Student stu2 = new Chap11Ex03_Student("1");
		System.out.println(stu2);
		String score = hashMap.get(stu2);
		System.out.println("1 �� �л��� ����: " + score);
	}
}

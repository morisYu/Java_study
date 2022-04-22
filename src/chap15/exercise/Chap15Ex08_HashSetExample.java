package chap15.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// �й��� ������ ������ ��ü�� �Ǵ��ؼ� �ߺ� ������ ���� �ʰ�
// Chap15Ex08_Student Ŭ�������� equals() �޼ҵ� ������
public class Chap15Ex08_HashSetExample {
	public static void main(String[] args) {

		Set<Chap15Ex08_Student> set = new HashSet<Chap15Ex08_Student>();

		set.add(new Chap15Ex08_Student(1, "ȫ�浿"));
		set.add(new Chap15Ex08_Student(2, "�ſ��"));
		set.add(new Chap15Ex08_Student(1, "���ο�"));

		Iterator<Chap15Ex08_Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Chap15Ex08_Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}

package chap15.sec04.art01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "ȫ�浿"), 95);
		// �й��� �̸��� �����ϱ� ������ �������� ����� ������ ��ġ��.
		map.put(new Student(1, "ȫ�浿"), 75);
		
		map.put(new Student(2, "���ڹ�"), 85);
		// �̸��� ������ �й��� �ٸ��� ������ Ű�� ���� �߰���.
		map.put(new Student(3, "���ڹ�"), 60);

		System.out.println("�� Entry ��: " + map.size());
	}
}

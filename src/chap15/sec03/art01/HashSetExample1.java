package chap15.sec03.art01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		// �̹� ����Ǿ��ִ� ��ü�� �ؽ��ڵ带 ���ؼ� ������ �ؽ��ڵ尡 �ִٸ�
		// equals() �޼ҵ�� �� ��ü�� �� �� ������ ��� �ߺ� �������� ����.
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();

		System.out.println("�� ��ü��: " + size);

		// �ε����� ��ü�� �˻��ϴ� �޼ҵ尡 ���� ��� ��ü ��ü�� ������� �� ����
		// �ݺ��ؼ� �������� �ݺ���(Iterator)�� ������.
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		// HashSet�� ��ü���� �������� �����ϱ� ������ �ε����� ��ü�� ������ �� ����
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("�� ��ü��: " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("��� ����");
		}

	}
}

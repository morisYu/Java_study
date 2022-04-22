package chap15.sec05.art04;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// treeSet�� ����� �� ���� ������ �ڵ� ���ĵ�
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));
		
		// ���� ������ ��忡�� ������ ������ ������ �ݺ��ؼ� ��������(��������)
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name+" : "+person.age);
		}
	}
}

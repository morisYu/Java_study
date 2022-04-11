package chap15.sec04.art01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExaple1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		// "ȫ�浿" Ű�� ���� ������ ���� �������� ������ ������ ��ġ��.
		map.put("ȫ�浿", 95);
		
		// �� Entry(key/value ��Ʈ) �� ���
		System.out.println("�� Entry ��: " + map.size());

		// �̸�(Ű)���� ����(��)�� �˻�
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();

		// Key Set ���
		Set<String> keySet = map.keySet();
		
		// �ݺ��ؼ� Ű�� ��� ���� Map���� ��
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// Ű�� Map.Entry�� ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());

		// Map.Entry Set ���
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		// �ݺ��ؼ� Map.Entry�� ��� Ű�� ���� ��
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}

		System.out.println();

		// ��� Map.Entry ����
		map.clear();
		System.out.println("�� Entry ��: " + map.size());

	}
}

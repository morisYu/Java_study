package chap15.sec05.art03;

import java.util.Map;
import java.util.TreeMap;

public class TreeExample1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "ȫ�浿");
		scores.put(new Integer(98), "�̵���");
		scores.put(new Integer(75), "�ڱ��");
		scores.put(new Integer(95), "�ſ��");
		scores.put(new Integer(80), "���ڹ�");
		
		Map.Entry<Integer, String> entry = null;
		
		// ���� ���� Map.Entry�� ����
		entry = scores.firstEntry();
		System.out.println("���� ���� ����: "+entry.getKey()+"-"+entry.getValue());
		
		// ���� ���� Map.Entry�� ����
		entry = scores.lastEntry();
		System.out.println("���� ���� ����: "+entry.getKey()+"-"+entry.getValue());
		
		// �־��� Ű���� �ٷ� �Ʒ� Map.Entry�� ����
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95�� �Ʒ� ����: "+entry.getKey()+"-"+entry.getValue());
		
		// �־��� Ű���� �ٷ� �� Map.Entry�� ����
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� ���� ����: "+entry.getKey()+"-"+entry.getValue());
		
		// �־��� Ű�� ������ Ű�� ������ �ش� Map.Entry�� ����
		// ������ Ű�� ���ٸ� �ٷ� �Ʒ��� Map.Entry�� ����
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: "+entry.getKey()+"-"+entry.getValue());
		
		// �־��� Ű�� ������ Ű�� ������ �ش� Map.Entry�� ����
		// ������ Ű�� ���ٸ� �ٷ� ���� Map.Entry�� ����
		entry = scores.ceilingEntry(new Integer(95));
		System.out.println("85�� �̰ų� �ٷ� ���� ����: "+entry.getKey()+"-"+entry.getValue());
	
		while(!scores.isEmpty()) {
			// ���� ���� Map.Entry�� �������� �÷��ǿ��� ������
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+"(���� ��ü ��: "+scores.size()+")");
		}
		
		while(!scores.isEmpty()) {
			// ���� ���� Map.Entry�� �������� �÷��ǿ��� ������
			entry = scores.pollLastEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+"(���� ��ü ��: "+scores.size()+")");
		}
	
	}
}

package chap13.sec04;

import chap13.sec02.Box2;

public class BoxingMethodExample {
	public static void main(String[] args) {
		// ��������� ��ü�� Ÿ���� ����
		Box2<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		// �����Ϸ��� �Ű����� Ÿ���� ���� ��ü���� Ÿ���� ����
		Box2<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
	}
}

package chap13.sec05;

public class Util {
	// ���ڸ� �����ϴ� ���׸� �޼ҵ�� �Ű������� Number Ÿ�� �Ǵ� ���� Ŭ���� Ÿ��
	// (Byte, Short, Integer, Long, Double)�� �ν��Ͻ��� ������ �Ѵ�.
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}

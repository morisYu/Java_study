package chap13.sec02;

public class Box {
	// Object Ŭ������ ��� �ڹ� Ŭ������ �ֻ��� ���� Ŭ�����̴�.
	private Object object;
	
	// �Ű����� Ÿ���� Object�� ��������ν� �ڹ��� ��� ��ü�� �Ű������� ���� �� �ִ�.
	
	public void set(Object object) {
		this.object = object;
	}
	
	// �ʵ忡 ����� ���� Ÿ���� ��ü�� �������� ���� Ÿ�� ��ȯ�� �ؾ���
	public Object get() {
		return object;
	}
}

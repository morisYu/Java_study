package chap13.sec02;

// ���׸��� Ŭ������ ������ �� ��ü���� Ÿ���� ������� �ʰ�, Ÿ�� �Ķ���ͷ� ��ü�ߴٰ�
// ���� Ŭ������ ���� �� ��ü���� Ÿ���� ���������ν� Ÿ�� ��ȯ�� �ּ�ȭ��Ų��.
public class Box2<T> {
	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

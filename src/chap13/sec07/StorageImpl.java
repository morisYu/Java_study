package chap13.sec07;

public class StorageImpl<T> implements Storage<T>{

	private T[] array;
	
	// �Ķ���ͷ� �迭�� �����Ϸ��� new T[n] ���·� ������ �� ����
	// (T[]) (new Object[n])���� �����ؾ��Ѵ�.
	@SuppressWarnings("unchecked")
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
}

package chap13.sec07;

public class StorageImpl<T> implements Storage<T>{

	private T[] array;
	
	// 파라미터로 배열을 생성하려면 new T[n] 형태로 생성할 수 없고
	// (T[]) (new Object[n])으로 생성해야한다.
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

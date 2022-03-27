package chap13.exercise;

public class Chap13Ex04_OtherPair<K, V> {
	private K key;
	private V value;
	
	public Chap13Ex04_OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

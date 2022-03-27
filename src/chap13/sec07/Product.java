package chap13.sec07;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKinde() {
		return this.kind;
	}
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}

class Tv{
	
}

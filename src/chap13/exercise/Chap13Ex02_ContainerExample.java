package chap13.exercise;

public class Chap13Ex02_ContainerExample {
	public static void main(String[] args) {
		Chap13Ex02_Container<String> container1 = new Chap13Ex02_Container<String>();
		container1.set("ȫ�浿");
		String str = container1.get();
		System.out.println("T = String: "+str);
		
		Chap13Ex02_Container<Integer> container2 = new Chap13Ex02_Container<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println("T = Integer: "+ value);
	}
}

class Chap13Ex02_Container<T> {
	private T container;
	
	public T get() {
		return container;
	}
	
	public void set(T container) {
		this.container = container;
	}
}

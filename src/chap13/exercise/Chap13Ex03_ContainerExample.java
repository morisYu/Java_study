package chap13.exercise;

public class Chap13Ex03_ContainerExample {
	public static void main(String[] args) {
		Chap13Ex03_Container<String, String> container1 = new Chap13Ex03_Container<String, String>();
		container1.set("ȫ�浿", "����");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println("�̸�: " + name1 + " ����: " + job);

		Chap13Ex03_Container<String, Integer> container2 = new Chap13Ex03_Container<String, Integer>();
		container2.set("ȫ�浿", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println("�̸�: " + name2 + " ����: " + age);
	}
}

class Chap13Ex03_Container<T, M> {
	public T key;
	public M value;

	public T getKey() {
		return key;
	}

	public M getValue() {
		return value;
	}

	public void set(T key, M value) {
		this.key = key;
		this.value = value;
	}
}
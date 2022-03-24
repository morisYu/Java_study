package chap13.sec02;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		
		// String -> Object (�ڵ� Ÿ�� ��ȯ)
		box.set("ȫ�浿");
		
		// Object -> String (���� Ÿ�� ��ȯ)
		String name = (String) box.get();
		System.out.println(name);
		
		// Apple -> Object (�ڵ� Ÿ�� ��ȯ)
		box.set(new Apple());
		
		// Object -> Apple (���� Ÿ�� ��ȯ)
		Apple apple = (Apple) box.get();
	}
}

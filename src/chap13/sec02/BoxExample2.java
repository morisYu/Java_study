package chap13.sec02;

// ���׸��� Ŭ������ ���� �� ��ü���� Ÿ���� ������.
public class BoxExample2 {
	public static void main(String[] args) {
		// String Ÿ�Ը� ���� �� ����
		Box2<String> box1 = new Box2<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println("String ��ü��: "+str);
		
		// Integer Ÿ�Ը� ���� �� ����
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println("Integer ��ü��: "+value);
		
		// Apple Ÿ�Ը� ���� �� ����
		Box2<Apple> box3 = new Box2<Apple>();
		box3.set(new Apple());
		Apple apple = box3.get();
		apple.method();
	}
}

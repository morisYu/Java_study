package chap13.sec02;

// 제네릭은 클래스가 사용될 때 구체적인 타입을 지정함.
public class BoxExample2 {
	public static void main(String[] args) {
		// String 타입만 받을 수 있음
		Box2<String> box1 = new Box2<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println("String 객체값: "+str);
		
		// Integer 타입만 받을 수 있음
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println("Integer 객체값: "+value);
		
		// Apple 타입만 받을 수 있음
		Box2<Apple> box3 = new Box2<Apple>();
		box3.set(new Apple());
		Apple apple = box3.get();
		apple.method();
	}
}

package chap13.sec02;

public class Box {
	// Object 클래스는 모든 자바 클래스의 최상위 조상 클래스이다.
	private Object object;
	
	// 매개변수 타입을 Object로 사용함으로써 자바의 모든 객체를 매개값으로 받을 수 있다.
	
	public void set(Object object) {
		this.object = object;
	}
	
	// 필드에 저장된 원래 타입의 객체를 얻으려면 강제 타입 변환을 해야함
	public Object get() {
		return object;
	}
}

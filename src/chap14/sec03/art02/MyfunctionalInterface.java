package chap14.sec03.art02;


// 람다식이 하나의 메소드를 정의하기 때문에 두 개 이상의 추상 메소드가 선언된 인터페이스는
// 람다식을 이용해서 구현 객체를 생성할 수 없다.
// @FunctionalInterface는 두 개 이상의 추상메소드가 선언되었는지 체크해줌.

@FunctionalInterface
public interface MyfunctionalInterface {
	public void method();
	
	// 두 개 이상의 추상메소드가 있으면 오류 발생
//	public void method2();
}

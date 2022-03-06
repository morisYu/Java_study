package chap08.sec07.art02;

public interface ChildInterface2 extends ParentInterface {
	@Override
	default void method2() {
		System.out.println("ChildInterface2 -method2()");
	}

	public void method3();
}

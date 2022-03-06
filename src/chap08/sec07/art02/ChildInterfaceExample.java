package chap08.sec07.art02;

// 인터페이스의 구현 클래스를 별도로 생성하지 않고 실행 클래서에서 구현 가능

public class ChildInterfaceExample {
	public static void main(String[] args) {
		
		// ChildInterface1 의 구현
		ChildInterface1 child1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ChildInterface1 -method1()");
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface1 -method3()");
			}
			
		};
		
		// ChildInterface2 의 구현
		ChildInterface2 child2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ChildInterface2 -method1()");
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2 -method3()");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface2 -method2() Override");
			}
			
		};
		
		// ChildInterface3 의 구현
		ChildInterface3 child3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ChildInterface2 -method1()");
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2 -method3()");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface3 -method2() Override");
			}
			
		};
		
		System.out.println("ChildInterface1 의 구현 \n");
		child1.method1();
		child1.method2();
		child1.method3();
		System.out.println("--------------------");
		
		System.out.println("ChildInterface2 의 구현 \n");
		child2.method1();
		child2.method2();
		child2.method3();
		System.out.println("--------------------");
		
		System.out.println("ChildInterface3 의 구현 \n");
		child3.method1();
		child3.method2();
		child3.method3();
		System.out.println("--------------------");
		
	}
}

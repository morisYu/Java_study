package chap14.sec03.art02;

public class MyfunctionalInterfaceExample {
	public static void main(String[] args) {
		MyfunctionalInterface fi1;
		
		// 인터페이스의 익명구현객체 생성
		MyfunctionalInterface fi2 = new MyfunctionalInterface() {
			@Override
			public void method() {
				String str = "fi2.method call";
				System.out.println(str);
				
			}
		};
		fi2.method();
		
		// 람다식으로 익명구현객체 생성
		fi1 = () -> {
			String str = "fi1.method call";
			System.out.println(str);
		};
		fi1.method();
		
		fi1 = () -> {
			System.out.println("fi1.method call2");
		};
		fi1.method();
		
		// 실행문이 하나라면 중괄호는 생략 가능
		fi1 = () -> System.out.println("fi1.method call3");
		fi1.method();
		
	}
}

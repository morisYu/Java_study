package chap09.sec03.art03;

public class Outter {

	// Java7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;  // final 특성을 가지기 때문에 수정 불가
		// localVariable = 100;  // final 특성을 가지기 때문에 수정 불가

		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	// Java8 이후(7 버전의 final 부분 생략되지만 final 특성을 가지기 때문에 값 수정 불가)
	public void method2(int arg) {
		int localVariable = 1;

//		arg = 100;
//		localVariable = 100;

		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}

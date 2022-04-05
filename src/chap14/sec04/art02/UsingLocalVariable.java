package chap14.sec04.art02;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		// final 특성 때문에 수정 불가
//		arg = 31;
//		localVar = 41;
		
		// 람다식
		MyfunctionalInterface fi = () -> {
			// 로컬 변수 읽기
			System.out.println("arg: "+arg);
			System.out.println("localVar: "+localVar+"\n");
		};
		fi.method();
	}
}

package chap14.sec04.art02;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		// final Ư�� ������ ���� �Ұ�
//		arg = 31;
//		localVar = 41;
		
		// ���ٽ�
		MyfunctionalInterface fi = () -> {
			// ���� ���� �б�
			System.out.println("arg: "+arg);
			System.out.println("localVar: "+localVar+"\n");
		};
		fi.method();
	}
}

package chap14.sec03.art03;

public class MyfunctionalInterfaceExample {
	public static void main(String[] args) {
		MyfunctionalInterface fi;

		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> {
			System.out.println(x*5);
		};
		fi.method(2);
		
		// �Ű������� �ϳ��� ��쿡�� ��ȣ�� ������ �� �ִ�.
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
}

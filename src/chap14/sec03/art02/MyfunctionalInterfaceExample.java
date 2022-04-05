package chap14.sec03.art02;

public class MyfunctionalInterfaceExample {
	public static void main(String[] args) {
		MyfunctionalInterface fi1;
		
		// �������̽��� �͸�����ü ����
		MyfunctionalInterface fi2 = new MyfunctionalInterface() {
			@Override
			public void method() {
				String str = "fi2.method call";
				System.out.println(str);
				
			}
		};
		fi2.method();
		
		// ���ٽ����� �͸�����ü ����
		fi1 = () -> {
			String str = "fi1.method call";
			System.out.println(str);
		};
		fi1.method();
		
		fi1 = () -> {
			System.out.println("fi1.method call2");
		};
		fi1.method();
		
		// ���๮�� �ϳ���� �߰�ȣ�� ���� ����
		fi1 = () -> System.out.println("fi1.method call3");
		fi1.method();
		
	}
}

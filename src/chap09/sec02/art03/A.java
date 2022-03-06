package chap09.sec02.art03;

public class A {
	A() {
		System.out.println("A ��ü�� ������");
	}

	// �ν��Ͻ� ��� Ŭ����
	public class B {
		B() {
			System.out.println("B ��ü�� ������");
		}

		int field1;
//		static int field2;

		void method1() {
		}
//		static void method2() {
//		}
	}

	// ���� ��� Ŭ����
	static class C {
		C() {
			System.out.println("C ��ü�� ������");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}

	}

	void method() {
		// ���� Ŭ����
		class D{
			D(){
				System.out.println("D ��ü�� ������");
			}
			
			@SuppressWarnings("unused")
			int field1;
//			static int field2;
			void method1() {
				
			}
//			static void method2() {
//				
//			}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}

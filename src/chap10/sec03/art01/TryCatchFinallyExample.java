package chap10.sec03.art01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}

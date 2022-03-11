package chap12.sec04.art01;

// User1�� User2�� ���� ��ü�� ������ ��� ó�� ������ ���� ���� ��ü�� ����� ����� �� ����
public class MainThreadExample {
	public static void main(String[] args) {
	Calculator calculator = new Calculator();
	
	// user1�� calculator ��ü�� �ʵ忡 100 �� ����
	User1 user1 = new User1();
	user1.setCalculator(calculator);
	user1.start();
	
	// user2�� A ���� �ʰ� calculator ��ü�� �ʵ忡 50�� ����
	User2 user2 = new User2();
	user2.setCalculator(calculator);
	user2.start();
	
	}
}

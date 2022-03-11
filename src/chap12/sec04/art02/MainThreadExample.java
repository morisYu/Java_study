package chap12.sec04.art02;

// User1�� User2�� ���� ��ü�� ������ ��� ó�� ������ ���� ���� ��ü�� ����� ����� �� ����
// ���� ��ü�� ����ȭ �� ��� �� �����尡 ���� ��ü�� ��� �� ������ü�� ���鼭 �ٸ� �����尡 ����� �� ����
// �Ϲ� �޼ҵ�� ���ÿ� ��� ����
public class MainThreadExample {
	public static void main(String[] args) {
	Calculator2 calculator = new Calculator2();
	
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

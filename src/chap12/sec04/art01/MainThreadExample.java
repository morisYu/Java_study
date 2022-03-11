package chap12.sec04.art01;

// User1과 User2가 같은 객체를 공유할 경우 처리 순서에 따라 공유 객체의 멤버가 변경될 수 있음
public class MainThreadExample {
	public static void main(String[] args) {
	Calculator calculator = new Calculator();
	
	// user1은 calculator 객체의 필드에 100 을 저장
	User1 user1 = new User1();
	user1.setCalculator(calculator);
	user1.start();
	
	// user2는 A 보다 늦게 calculator 객체의 필드에 50을 저장
	User2 user2 = new User2();
	user2.setCalculator(calculator);
	user2.start();
	
	}
}

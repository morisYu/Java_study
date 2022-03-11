package chap12.sec04.art02;

// User1과 User2가 같은 객체를 공유할 경우 처리 순서에 따라 공유 객체의 멤버가 변경될 수 있음
// 공유 객체를 동기화 할 경우 한 스레드가 공유 객체를 사용 시 공유객체가 잠기면서 다른 스레드가 사용할 수 없음
// 일반 메소드는 동시에 사용 가능
public class MainThreadExample {
	public static void main(String[] args) {
	Calculator2 calculator = new Calculator2();
	
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

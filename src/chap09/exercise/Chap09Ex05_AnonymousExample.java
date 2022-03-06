package chap09.exercise;

public class Chap09Ex05_AnonymousExample {
	public static void main(String[] args) {
		Chap09Ex05_Anonymous anony = new Chap09Ex05_Anonymous();
		
		// 익명 객체 필드 사용
		anony.field.run();
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 익명 객체 매개값 사용
		anony.method2(new Chap09Ex05_Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}

		});
	}
}

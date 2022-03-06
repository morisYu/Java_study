package chap09.exercise;

public class Chap09Ex05_Anonymous {
	
	// 필드 초기값으로 대입
	Chap09Ex05_Vehicle field = new Chap09Ex05_Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
		
	};

	void method1() {
		// 로컬 변수값으로 대입
		Chap09Ex05_Vehicle localVar = new Chap09Ex05_Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
			
		};
		// 로컬 변수 사용
		localVar.run();
	}
	
	void method2(Chap09Ex05_Vehicle v){
		v.run();
	}
}

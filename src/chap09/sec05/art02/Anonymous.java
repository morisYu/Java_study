package chap09.sec05.art02;

public class Anonymous {
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV 를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV 를 끕니다.");
		}
	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio 를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio 를 끕니다.");
			}
		};
		
		// 로컬 변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}

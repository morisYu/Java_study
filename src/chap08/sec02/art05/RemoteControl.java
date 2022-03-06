package chap08.sec02.art05;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	// 추상 메소드
	public abstract void turnOn();

	// public abstract 생략 해도 컴파일 시 자동으로 붙음.
	public void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}

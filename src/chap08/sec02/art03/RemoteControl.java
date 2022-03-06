package chap08.sec02.art03;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드
	public abstract void turnOn();
	// public abstract 생략 해도 컴파일 시 자동으로 붙음.
	public void turnOff();
	void setVolume(int volume);
	
}

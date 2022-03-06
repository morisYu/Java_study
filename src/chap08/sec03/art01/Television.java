package chap08.sec03.art01;

import chap08.sec02.art05.RemoteControl;

public class Television implements RemoteControl {

	static final String obj = "TV";
	private int volume;

	@Override
	public void turnOn() {
		System.out.println(obj + "를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println(obj + "를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(obj + "의 현재 볼륨: " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리!!");
		} else {
			System.out.println("무음 해제!!!");
		}
	}
	
}

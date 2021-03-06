package chap08.sec03.art01;

import chap08.sec02.art05.RemoteControl;

public class Audio implements RemoteControl {

	static final String obj = "Audio";
	private int volume;

	@Override
	public void turnOn() {
		System.out.println(obj + "?? ?մϴ?.");

	}

	@Override
	public void turnOff() {
		System.out.println(obj + "?? ???ϴ?.");
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
		System.out.println(obj + "?? ???? ????: " + this.volume);
	}

}

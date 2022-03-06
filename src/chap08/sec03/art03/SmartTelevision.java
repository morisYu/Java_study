package chap08.sec03.art03;

import chap08.sec02.art05.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("smartTV ON");

	}

	@Override
	public void turnOff() {
		System.out.println("smartTV OFF");

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
		System.out.println("Smart TV ����: " + this.volume);
	}

}

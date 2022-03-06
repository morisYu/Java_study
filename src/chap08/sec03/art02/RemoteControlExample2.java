package chap08.sec03.art02;

import chap08.sec02.art05.RemoteControl;

public class RemoteControlExample2 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("劳疙 备泅 ON");
				
			}

			@Override
			public void turnOff() {
				System.out.println("劳疙 备泅 OFF");
				
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("劳疙 备泅 Set");
				
			}
		};
		rc.turnOn();
		System.out.println(rc.MAX_VOLUME);
	}
}

package chap08.sec04.art02;

public class Audio implements RemoteControl {

	private static final String obj = "Audio";
	private int volume;
	private boolean mute;

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
		this.mute = mute;
		if(mute) {
			System.out.println(obj+"를 무음 "+this.mute);
		}else {
			System.out.println(obj+"를 무음 "+this.mute);
		}
	}

}

package chap08.sec02.art03;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	public abstract void turnOn();
	// public abstract ���� �ص� ������ �� �ڵ����� ����.
	public void turnOff();
	void setVolume(int volume);
	
}

package chap08.sec04.art01;

import chap08.sec02.art05.RemoteControl;
import chap08.sec03.art01.Audio;
import chap08.sec03.art01.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc=null;
		
		rc = new Television();
		rc.turnOn();  // �߻�޼ҵ� �������̵� �� ȣ��
		rc.turnOff();  // �߻�޼ҵ� �������̵� �� ȣ��
		rc.setMute(true);  // ���� �������̽��� ����Ʈ �޼ҵ� ȣ��
		RemoteControl.changeBattery();  // �������̽��� ���� �޼ҵ� ȣ��
		
		rc = new Audio();
		rc.turnOn();  // �߻�޼ҵ� �������̵� �� ȣ��
		rc.turnOff();  // �߻�޼ҵ� �������̵� �� ȣ��
		rc.setMute(true);  // �������̽��� ����Ʈ �޼ҵ带 �������̵� �� ȣ��
	}
}

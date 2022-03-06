package chap07.sec02.art01;

public class DmbCellPhoneEaxmple {

	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		// CellPhone 으로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("모델: " + dmbCellPhone.color);

		// DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);

		// CellPhone 으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요. 홍길동");
		dmbCellPhone.sendVoice("아~ 예 반갑");
		dmbCellPhone.hangUp();

		// DmbCellPhone 의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}

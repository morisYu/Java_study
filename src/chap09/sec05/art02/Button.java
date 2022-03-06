package chap09.sec05.art02;

public class Button {
	OnClickListener listener;  // 중첩 인터페이스 타입의 필드

	// 매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// 구현 객체의 onClick() 메소드 호출
	void touch() {
		listener.onClick();
	}

	// 중첩 인터페이스
	interface OnClickListener {
		void onClick();
	}
}

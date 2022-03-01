package chap06.sec06.art02;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();

		String[] car = new String[myCar.company.length];

		for (int i = 0; i < 3; i++) {
			car[i] = myCar.company[i];
		}

		// 필드값 읽기
		for (int i = 0; i < 3; i++) {
			System.out.println("제작회사: " + car[i]);
		}

		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);

		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		myCar.company[2] = "BMW";
		System.out.println("수정된 차: " + myCar.company[2]);
	}
}

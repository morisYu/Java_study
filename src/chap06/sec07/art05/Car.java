package chap06.sec07.art05;

public class Car {

	// 필드
	String company = "현대자동창";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car() {

	}

	Car(String model) {
		this(model,null,0);
	}

	Car(String model, String color) {
		this(model,color,0);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

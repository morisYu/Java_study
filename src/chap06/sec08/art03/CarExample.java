package chap06.sec08.art03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ�: " + speed + " km/h");
	}
}

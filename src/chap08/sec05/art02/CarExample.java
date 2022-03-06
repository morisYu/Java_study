package chap08.sec05.art02;

public class CarExample {
	public static void main(String[] args) {
		Car mycar = new Car();

		mycar.run();

		mycar.frontLeftTire = new KumhoTire();
		mycar.frontRightTire = new KumhoTire();
		
		mycar.run();
	}
}
